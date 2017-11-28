package com.example.mvp2.view;

/**
 * Created by 小狼 on 2017/11/28.
 */

public interface Regview extends Baseview<Baseview> {

    void Regsuccess(String msg);
    void Regfail(String msg);
}
