package org.jwl_msi.android.freeweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author JWL-MSI
 * @version V1.0
 * @ClassName: ${FILE_NAME}
 * @Description: ${TODO}(省级对应的实体类)
 * @Date 2017/7/10 13:01
 */
public class Province extends DataSupport{
    private  int id;
    private  String provinceName;
    private  int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
