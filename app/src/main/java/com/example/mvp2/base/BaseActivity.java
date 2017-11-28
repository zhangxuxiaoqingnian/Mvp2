package com.example.mvp2.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mvp2.presenter.Basepresenter;

/**
 * Created by 小狼 on 2017/11/28.
 */

public abstract class BaseActivity<P extends Basepresenter> extends AppCompatActivity {

    public P presenter;
    public abstract P initPresenter();
    public abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        presenter = initPresenter();
        initView();


    }

    public abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.deatach();
    }
}
