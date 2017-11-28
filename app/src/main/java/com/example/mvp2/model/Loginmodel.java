package com.example.mvp2.model;

import com.example.mvp2.type.Baselogin;
import com.example.mvp2.utils.NetRequestUtils;


import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 小狼 on 2017/11/28.
 */

public class Loginmodel{

    private Setdata setdata;

    public void getlog(String mobile, String password){

        System.out.println("经过了");

        Observable<Baselogin> baseloginObservable = new NetRequestUtils().bucuo().getbaseretrofit().login(mobile, password).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        setdata.transmit(baseloginObservable);

    }
    public void getreg(String mobile, String password){

        Observable<Baselogin> baseloginObservable = new NetRequestUtils().bucuo().getbaseretrofit().reg(mobile, password).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        setdata.transmit(baseloginObservable);
    }

    public interface Setdata{

        void transmit(Observable<Baselogin> baseloginObservable);
    }
    public void Chuan(Setdata setdata){
        this.setdata=setdata;
    }

}
