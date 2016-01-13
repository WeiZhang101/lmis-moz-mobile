/*
 * This program is part of the OpenLMIS logistics management information
 * system platform software.
 *
 * Copyright © 2015 ThoughtWorks, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details. You should
 * have received a copy of the GNU Affero General Public License along with
 * this program. If not, see http://www.gnu.org/licenses. For additional
 * information contact info@OpenLMIS.org
 */


package org.openlmis.core.model.repository;

import android.content.Context;

import com.google.inject.Inject;
import com.j256.ormlite.dao.Dao;

import org.openlmis.core.exceptions.LMISException;
import org.openlmis.core.manager.SharedPreferenceMgr;
import org.openlmis.core.model.KitProduct;
import org.openlmis.core.model.Product;
import org.openlmis.core.model.StockCard;
import org.openlmis.core.persistence.DbUtil;
import org.openlmis.core.persistence.GenericDao;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import static org.openlmis.core.model.Product.*;

public class ProductRepository {

    GenericDao<Product> genericDao;

    GenericDao<KitProduct> kitProductGenericDao;

    @Inject
    DbUtil dbUtil;

    @Inject
    StockRepository stockRepository;

    @Inject
    SharedPreferenceMgr sharedPreferenceMgr;

    @Inject
    public ProductRepository(Context context) {
        genericDao = new GenericDao<>(Product.class, context);
        kitProductGenericDao = new GenericDao<>(KitProduct.class, context);
    }

    public List<Product> listActiveProducts(final IsKit isKit) throws LMISException {
        List<Product> activeProducts = dbUtil.withDao(Product.class, new DbUtil.Operation<Product, List<Product>>() {
            @Override
            public List<Product> operate(Dao<Product, String> dao) throws SQLException {
                return dao.queryBuilder().where().eq("isActive", true).and().eq("isKit", isKit.isKit()).query();
            }
        });
        Collections.sort(activeProducts);
        return activeProducts;
    }

    public void save(final List<Product> products) {
        try {
            dbUtil.withDaoAsBatch(Product.class, new DbUtil.Operation<Product, Void>() {
                @Override
                public Void operate(Dao<Product, String> dao) throws SQLException {
                    for (Product product : products) {
                        dao.create(product);
                    }
                    return null;
                }
            });
        } catch (LMISException e) {
            e.reportToFabric();
        }
    }

    public void batchCreateOrUpdateProducts(final List<Product> productList) throws LMISException {
        dbUtil.withDaoAsBatch(Product.class, new DbUtil.Operation<Product, Void>() {
            @Override
            public Void operate(Dao<Product, String> dao) throws SQLException {
                for (Product product : productList) {
                    try {
                        createOrUpdate(product);
                    } catch (LMISException e) {
                        e.reportToFabric();
                    }
                }
                return null;
            }
        });
    }

    //DON'T USE - THIS WILL BE PRIVATE WHEN KIT FEATURE TOGGLE IS ON
    public void createOrUpdate(Product product) throws LMISException {
        Product existingProduct = getByCode(product.getCode());
        if (existingProduct != null) {
            updateDeactivateProductNotifyList(product, existingProduct);
            product.setId(existingProduct.getId());
            product.setArchived(existingProduct.isArchived());
            genericDao.update(product);
        } else {
            genericDao.create(product);
        }

        createKitProductsIfNotExist(product);
    }

    private void updateDeactivateProductNotifyList(Product product, Product existingProduct) throws LMISException {
        if (product.isActive() == existingProduct.isActive()) {
            return;
        }
        if (product.isActive()) {
            sharedPreferenceMgr.removeShowUpdateBannerTextWhenReactiveProduct(existingProduct.getPrimaryName());
            return;
        }
        
        StockCard stockCard = stockRepository.queryStockCardByProductId(existingProduct.getId());
        if (stockCard == null) {
            return;
        }
        if (stockCard.getStockOnHand() == 0) {
            sharedPreferenceMgr.setIsNeedShowProductsUpdateBanner(true, product.getPrimaryName());
        }

    }

    private void createKitProductsIfNotExist(Product product) throws LMISException {
        if (product.getKitProductList() != null && !product.getKitProductList().isEmpty()) {
            for (KitProduct kitProduct : product.getKitProductList()) {
                createProductForKitIfNotExist(kitProduct);
                KitProduct kitProductInDB = queryKitProductByCode(kitProduct.getKitCode(), kitProduct.getProductCode());
                if (kitProductInDB == null) {
                    kitProductGenericDao.create(kitProduct);
                }
            }
        }
    }

    private void createProductForKitIfNotExist(KitProduct kitProduct) throws LMISException {
        Product existingProduct = getByCode(kitProduct.getProductCode());
        if (existingProduct == null) {
            Product newProduct = new Product();
            newProduct.setCode(kitProduct.getProductCode());
            createOrUpdate(newProduct);
        }
    }

    protected KitProduct queryKitProductByCode(final String kitCode, final String productCode) throws LMISException {
        return dbUtil.withDao(KitProduct.class, new DbUtil.Operation<KitProduct, KitProduct>() {
            @Override
            public KitProduct operate(Dao<KitProduct, String> dao) throws SQLException {
                return dao.queryBuilder().where().eq("kitCode", kitCode).and().eq("productCode", productCode).queryForFirst();
            }
        });
    }

    public Product getById(long id) {
        try {
            return genericDao.getById(String.valueOf(id));
        } catch (LMISException e) {
            e.reportToFabric();
            return null;
        }
    }

    public Product getByCode(final String code) throws LMISException {
        return dbUtil.withDao(Product.class, new DbUtil.Operation<Product, Product>() {
            @Override
            public Product operate(Dao<Product, String> dao) throws SQLException {
                return dao.queryBuilder().where().eq("code", code).queryForFirst();
            }
        });
    }

    public List<Product> queryProducts(final long programId) throws LMISException {
        return dbUtil.withDao(Product.class, new DbUtil.Operation<Product, List<Product>>() {
            @Override
            public List<Product> operate(Dao<Product, String> dao) throws SQLException {
                return dao.queryBuilder().where().eq("program_id", programId).query();
            }
        });
    }
}
