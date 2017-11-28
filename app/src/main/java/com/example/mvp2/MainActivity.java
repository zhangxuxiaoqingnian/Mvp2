package com.example.mvp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mvp2.base.BaseActivity;
import com.example.mvp2.presenter.Loginpresenter;
import com.example.mvp2.type.Baselogin;
import com.example.mvp2.view.Loginview;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends BaseActivity<Loginpresenter> implements Loginview{

    @Override
    public Loginpresenter initPresenter() {
        return new Loginpresenter(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {


        presenter.getdiao("15810672623","123456");

    }

    @Override
    public void showprogress() {


    }

    @Override
    public void hideprogress() {

    }

    @Override
    public void showFail(String msg) {

    }

    @Override
    public void loginsucces(Observable<Baselogin> baseloginObservable) {

        baseloginObservable.subscribe(new Observer<Baselogin>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Baselogin baselogin) {

                String msg = baselogin.msg;
                System.out.println("+++++++++++"+msg);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    @Override
    public void loginfail(String msg) {

    }
    //ksjdkfjsdkfjskdfjsd
}
