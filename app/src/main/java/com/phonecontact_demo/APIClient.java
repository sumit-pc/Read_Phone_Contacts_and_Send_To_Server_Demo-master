package com.phonecontact_demo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class APIClient {

    private static final String BASE_URL = "http://192.168.13.101:56456";
    private static Retrofit retrofit = null;

    static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    public static Retrofit getClientForObjects() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
    public static Retrofit getClientForString(){
        if (retrofit == null) {
            //Log.e("call","new retrofit is added");
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL).addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    public static void Reset(){
        retrofit=null;
    }

    public static boolean isInternetConnected(Context mContext) {

        try {
            ConnectivityManager connect = null;
            connect = (ConnectivityManager) mContext
                    .getSystemService(Context.CONNECTIVITY_SERVICE);


            if(connect != null)
            {
                NetworkInfo info = connect.getActiveNetworkInfo();
                if(info != null)
                {
                    if(info.getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }


}
