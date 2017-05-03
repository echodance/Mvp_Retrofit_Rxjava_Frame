package com.zq.mvp_retrofit_rxjava_frame.service;

import android.content.Context;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *  提供 请求网络服务对象
 */

public class RetrofitHelper {

    private Context mContext;
    private OkHttpClient client = new OkHttpClient();
    private GsonConverterFactory mFactory = GsonConverterFactory.create(new GsonBuilder().create());
    private static  RetrofitHelper mInstance = null;
    private Retrofit mRetrofit = null;

    public static RetrofitHelper getInstance(Context context){
        if (null == mInstance){
            mInstance = new RetrofitHelper(context);
        }
        return mInstance;
    }

    private RetrofitHelper(Context context){
        this.mContext = context;
        init();
    }

    private void init() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                .client(client)
                .addConverterFactory(mFactory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public RetrofitService getServer(){
        return mRetrofit.create(RetrofitService.class);
    }
}
