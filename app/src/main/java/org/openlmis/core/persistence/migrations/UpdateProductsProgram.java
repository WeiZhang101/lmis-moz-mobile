package org.openlmis.core.persistence.migrations;

import org.openlmis.core.persistence.Migration;

public class UpdateProductsProgram extends Migration {
    @Override
    public void up() {
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08A1ZZ'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08A1ZZ',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08D05'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08D05',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L01'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L01',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L02'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L02',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L02X'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L02X',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L03'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L03',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L04'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L04',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L05'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L05',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L07'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L07',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L07P'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L07P',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L08'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L08',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L09'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L09',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L0XZ'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L0XZ',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L0ZP'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L0ZP',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L10'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L10',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L10X'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L10X',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08L11'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','08L11',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08O05'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('MALARIA','08O05',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08O05X'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('MALARIA','08O05X',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08O05Y'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('MALARIA','08O05Y',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08O05Z'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('MALARIA','08O05Z',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S01'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S01',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S01B'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('ESS_MEDS','08S01B',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S01Z'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S01Z',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S08'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S08',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S09'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S09',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S13'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S13',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S15'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PTV','08S15',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S17'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PTV','08S17',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S18'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S18',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S18Y'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S18Y',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S18Z'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S18Z',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S19'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S19',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S20'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S20',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S21'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S21',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S22'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PTV','08S22',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S23'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PTV','08S23',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S29'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S29',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S30'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S30',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S32'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S32',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S32B'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S32B',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S36'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S36',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S39'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S39',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S39B'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S39B',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S39Y'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('ESS_MEDS','08S39Y',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S39Z'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S39Z',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S40'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PTV','08S40',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S42'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','08S42',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='11A0XX'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','11A0XX',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='121'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TEST_KIT','121',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='22A0YY'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TB','22A0YY',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='8S34B'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','8S34B',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='KIT001'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PME','KIT001',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='KIT002'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PME','KIT002',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='ZEL96'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TEST_KIT','ZEL96',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S01ZZ'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('ESS_MEDS','08S01ZZ',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S32Z'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('ESS_MEDS','08S32Z',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S34B'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('ESS_MEDS','08S34B',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S40Z'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('ESS_MEDS','08S40Z',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='08S42B'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('ESS_MEDS','08S42B',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='SCOD10'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PME','SCOD10',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='SCOD12'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('PME','SCOD12',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='ZEL111'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TARV','ZEL111',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
        execSQL("UPDATE product_programs SET isActive = 0 WHERE productCode ='ZEL124'");
        execSQL("INSERT INTO product_programs(programCode,productCode,isActive,createdAt,updatedAt) VALUES ('TEST_KIT','ZEL124',1,datetime(CURRENT_TIMESTAMP, 'localtime'),datetime(CURRENT_TIMESTAMP, 'localtime'))");
    }
}