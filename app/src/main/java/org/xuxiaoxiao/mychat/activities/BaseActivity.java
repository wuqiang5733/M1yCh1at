package org.xuxiaoxiao.mychat.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.squareup.otto.Bus;
import com.wilddog.wilddogauth.WilddogAuth;

import org.xuxiaoxiao.mychat.infrastructure.MyChatApplication;

/**
 * Created by WuQiang on 2017/1/25.
 */

public class BaseActivity extends AppCompatActivity {
    protected MyChatApplication application;
    protected Bus bus;
    protected WilddogAuth auth;
    protected WilddogAuth.AuthStateListener authStateListener;
    protected String userEmail,userName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (MyChatApplication) getApplication();
        bus = application.getBus();
        bus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
