package com.example.mvp2.presenter;

import com.example.mvp2.model.Loginmodel;
import com.example.mvp2.type.Baselogin;
import com.example.mvp2.view.Baseview;
import com.example.mvp2.view.Loginview;

import io.reactivex.Observable;

/**
 * Created by 小狼 on 2017/11/28.
 */

public class Loginpresenter extends  Basepresenter<Loginview> implements Loginmodel.Setdata {


    private final Loginmodel loginmodel;
    private Loginview loginview;
    public Loginpresenter(Loginview tview) {
        super(tview);
        this.loginview=tview;
        loginmodel = new Loginmodel();
        loginmodel.Chuan(this);
    }

    public void getdiao(String mobile,String password){

        loginmodel.getlog(mobile,password);
    }


    @Override
    public void transmit(Observable<Baselogin> baseloginObservable) {

        loginview.loginsucces(baseloginObservable);

    }
}
