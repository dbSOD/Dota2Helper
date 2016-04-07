package com.fangxu.dota2helper.network;


import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by Xuf on 2016/4/6.
 */
public enum AppNetWork {
    INSTANCE;

    private NewsApi mNewsApi;

    AppNetWork() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dota2server.applinzi.com")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mNewsApi = retrofit.create(NewsApi.class);
    }

    public NewsApi getNewsApi() {
        return mNewsApi;
    }
}
