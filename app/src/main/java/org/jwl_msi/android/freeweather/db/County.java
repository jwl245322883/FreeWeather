package org.jwl_msi.android.freeweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author JWL-MSI
 * @version V1.0
 * @ClassName: ${FILE_NAME}
 * @Description: ${TODO}(县级对应的实体类)
 * @Date 2017/7/10 13:08
 */
public class County extends DataSupport {
   private int id;
    private String countyName;
    private String weatherID;
    private int cityID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
}
