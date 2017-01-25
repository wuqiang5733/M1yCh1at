package org.xuxiaoxiao.mychat.dialog;

import android.app.DialogFragment;
import android.os.Bundle;

import com.squareup.otto.Bus;

import org.xuxiaoxiao.mychat.infrastructure.MyChatApplication;

/**
 * Created by WuQiang on 2017/1/25.
 */

public class BaseDialog extends DialogFragment {
    protected MyChatApplication application;
    protected Bus bus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (MyChatApplication) getActivity().getApplication();
        bus = application.getBus();
        bus.register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
