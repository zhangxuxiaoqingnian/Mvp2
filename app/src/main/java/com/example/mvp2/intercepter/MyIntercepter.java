package com.example.mvp2.intercepter;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 小狼 on 2017/11/28.
 */

public class MyIntercepter implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response proceed = chain.proceed(request);
        return proceed;
    }
}
