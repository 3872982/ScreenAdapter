package com.learning.yunmusicadapter;

import android.app.Application;

import com.learning.wangyi.UIUtils;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UIUtils.getInstance(getApplicationContext());
    }
}
