package com.example.mvp2.utils;

import com.example.mvp2.base.Baseretrofit;
import com.example.mvp2.intercepter.MyIntercepter;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 小狼 on 2017/11/28.
 */

public class NetRequestUtils {

    private NetRequestUtils Instance;
    private Baseretrofit baseretrofit;

    public NetRequestUtils(Baseretrofit baseretrofit) {

        this.baseretrofit=baseretrofit;
    }

    public NetRequestUtils() {

    }

    public Baseretrofit getbaseretrofit(){

        return baseretrofit;
    }



    public NetRequestUtils bucuo(){

        OkHttpClient.Builder okHttpClient= new OkHttpClient.Builder();
        okHttpClient.addInterceptor(new MyIntercepter());

        Retrofit.Builder retrofit=new Retrofit.Builder().baseUrl("https://www.zhaoapi.cn/").client(okHttpClient.build());
        retrofit.addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create());

        Baseretrofit baseretrofit = retrofit.build().create(Baseretrofit.class);

        NetRequestUtils Instance=new NetRequestUtils(baseretrofit);

        return Instance;


    }
}
