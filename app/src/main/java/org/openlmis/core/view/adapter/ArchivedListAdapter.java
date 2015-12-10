package org.openlmis.core.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.openlmis.core.R;
import org.openlmis.core.view.holder.ArchivedDrugsViewHolder;
import org.openlmis.core.view.holder.ArchivedDrugsViewHolder.ArchiveStockCardListener;
import org.openlmis.core.view.viewmodel.StockCardViewModel;

import java.util.List;

public class ArchivedListAdapter extends InventoryListAdapter<ArchivedDrugsViewHolder> {

    private ArchiveStockCardListener stockCardListener;

    public ArchivedListAdapter(List<StockCardViewModel> data, ArchiveStockCardListener stockCardListener) {
        super(data);
        this.stockCardListener = stockCardListener;
    }

    @Override
    public ArchivedDrugsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ArchivedDrugsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_archived_drug, parent, false));
    }

    @Override
    public void onBindViewHolder(ArchivedDrugsViewHolder holder, int position) {
        holder.populate(currentList.get(position), queryKeyWord, stockCardListener);
    }

}