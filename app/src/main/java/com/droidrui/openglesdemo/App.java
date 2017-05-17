package com.droidrui.openglesdemo;

import android.app.Application;

/**
 * Created by lingrui on 2017/5/17.
 */

public class App extends Application {


    private static App sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = (App) getApplicationContext();
    }

    public static App getContext() {
        return sContext;
    }

}
