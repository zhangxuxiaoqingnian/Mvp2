package com.example.mvp2.presenter;

/**
 * Created by 小狼 on 2017/11/28.
 */

public class Basepresenter<T> {

    private T tview;

    public Basepresenter(T tview) {
        this.tview=tview;
    }
    public void deatach(){
        this.tview = null;
    }
}
