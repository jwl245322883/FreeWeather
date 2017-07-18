package org.jwl_msi.android.freeweather.util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jwl_msi.android.freeweather.db.City;
import org.jwl_msi.android.freeweather.db.County;
import org.jwl_msi.android.freeweather.db.Province;

/**
 * @author JWL-MSI
 * @version V1.0
 * @ClassName: ${FILE_NAME}
 * @Description: ${TODO}(用一句话描述该文件做什么)
 * @Date 2017/7/10 18:19
 */
public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
            JSONArray allProvinces = new JSONArray(response);

            for (int i=0; i<allProvinces.length();i++){
                JSONObject provincesObject =  allProvinces.getJSONObject(i);
                Province province = new Province();
                province.setProvinceName(provincesObject.getString("name"));
                province.setProvinceCode(provincesObject.getInt("id"));
                province.save();
            }
            return  true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
return false;
    }
    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
            JSONArray allCities = new JSONArray(response);

            for (int i=0; i<allCities.length();i++){
                JSONObject citiesObject = allCities.getJSONObject(i);
                City city = new City();
                city.setCityName(citiesObject.getString("name"));
                city.setCityCode(citiesObject.getInt("id"));
                city.setProvinceId(provinceId);
                city.save();
            }
            return  true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
return false;
    }
    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountyResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);

                for (int i=0; i<allCounties.length();i++){
                    JSONObject countiesObject =  allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countiesObject.getString("name"));
                    county.setWeatherID(countiesObject.getString("weather_id"));
                    county.setCityID(countiesObject.getInt("id"));
                    county.save();
                }
                return  true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
