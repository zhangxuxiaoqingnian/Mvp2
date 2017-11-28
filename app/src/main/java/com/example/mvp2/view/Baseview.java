package com.example.mvp2.view;

/**
 * Created by 小狼 on 2017/11/28.
 */

public interface Baseview<L extends Baseview> {

    void showprogress();
    void hideprogress();
    void showFail(String msg);
}
