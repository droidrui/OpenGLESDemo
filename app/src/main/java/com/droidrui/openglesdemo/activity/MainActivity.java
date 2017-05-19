package com.droidrui.openglesdemo.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.droidrui.openglesdemo.view.MyTDView;

public class MainActivity extends AppCompatActivity {

    MyTDView mview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为竖屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mview = new MyTDView(this);
        mview.requestFocus();
        mview.setFocusableInTouchMode(true);
        setContentView(mview);
    }

    @Override
    public void onResume() {
        super.onResume();
        mview.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mview.onPause();
    }
}
