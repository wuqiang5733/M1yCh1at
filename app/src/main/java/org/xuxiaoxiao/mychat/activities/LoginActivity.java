package org.xuxiaoxiao.mychat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.LinearLayout;

import org.xuxiaoxiao.mychat.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by WuQiang on 2017/1/25.
 */

public class LoginActivity extends BaseActivity {
    @BindView(R.id.activity_login_linear_layout)
    LinearLayout linearLayout;

    @BindView(R.id.activity_login_registerButton)
    Button registerButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        linearLayout.setBackgroundResource(R.drawable.background_screen_two);
    }

    @OnClick(R.id.activity_login_registerButton)
    public void setRegisterButton(){
        startActivity(new Intent(this,RegisterActivity.class));
        finish();
    }
}
