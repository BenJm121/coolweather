package com.example.fr.coolweather.util;

/**
 * Created by FR on 2017/5/3.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqeue(callback);
    }
}
