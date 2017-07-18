package org.jwl_msi.android.freeweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author JWL-MSI
 * @version V1.0
 * @ClassName: ${FILE_NAME}
 * @Description: ${TODO}(用一句话描述该文件做什么)
 * @Date 2017/7/10 18:15
 */

public class HttpUtil {
    public  static  void  sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
