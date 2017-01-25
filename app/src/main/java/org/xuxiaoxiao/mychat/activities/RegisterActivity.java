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
public class RegisterActivity extends BaseActivity{
    @BindView(R.id.activity_register_logginButton)
    Button loginButton;

    @BindView(R.id.activity_register_linear_layout)
    LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        linearLayout.setBackgroundResource(R.drawable.background_screen_two);
    }
    @OnClick(R.id.activity_register_logginButton)
    public void setLoginButton(){
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }
}
