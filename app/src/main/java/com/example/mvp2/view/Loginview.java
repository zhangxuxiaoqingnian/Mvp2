package com.example.mvp2.view;

import com.example.mvp2.type.Baselogin;

import io.reactivex.Observable;

/**
 * Created by 小狼 on 2017/11/28.
 */

public interface Loginview extends Baseview<Baseview> {

    void loginsucces(Observable<Baselogin> baseloginObservable);
    void loginfail(String msg);
}
