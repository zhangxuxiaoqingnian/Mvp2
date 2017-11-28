package com.example.mvp2.base;

import com.example.mvp2.type.Baselogin;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by 小狼 on 2017/11/28.
 */

public interface Baseretrofit {

    @POST("user/login")
    @FormUrlEncoded
    Observable<Baselogin> login(@Field("mobile") String mobile,@Field("password") String password);

    @POST("user/reg")
    @FormUrlEncoded
    Observable<Baselogin> reg(@Field("mobile") String mobile,@Field("password") String password);
}
