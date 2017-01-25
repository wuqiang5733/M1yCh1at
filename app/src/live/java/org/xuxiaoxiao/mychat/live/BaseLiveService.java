package org.xuxiaoxiao.mychat.live;

import com.squareup.otto.Bus;
import com.wilddog.wilddogauth.WilddogAuth;
import com.wilddog.wilddogcore.WilddogApp;
import com.wilddog.wilddogcore.WilddogOptions;

import org.xuxiaoxiao.mychat.infrastructure.MyChatApplication;
import org.xuxiaoxiao.mychat.infrastructure.Utils;

public class BaseLiveService {
    protected Bus bus;
    protected MyChatApplication application;
//    protected WilddogAuth auth;

    public BaseLiveService(MyChatApplication application) {
        this.application = application;
        bus = application.getBus();
        bus.register(this);
//        auth = FirebaseAuth.getInstance();
//        auth = WilddogAuth.getInstance();


    }
}
