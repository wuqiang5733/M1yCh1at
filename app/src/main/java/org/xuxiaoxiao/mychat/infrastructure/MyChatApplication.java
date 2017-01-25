package org.xuxiaoxiao.mychat.infrastructure;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * Created by WuQiang on 2017/1/25.
 */

public class MyChatApplication extends Application{

//    <application    一定要有这么一句 ！！
//    android:name=".infrastructure.MyChatApplication"

    private Bus bus;

    public MyChatApplication() {
        this.bus = new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        WilddogApp.getInstance();
    }

    public Bus getBus() {
        return bus;
    }

}
