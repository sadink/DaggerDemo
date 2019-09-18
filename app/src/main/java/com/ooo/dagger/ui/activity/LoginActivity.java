package com.ooo.dagger.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ooo.dagger.R;
import com.ooo.dagger.component.DaggerCommonComponent;
import com.ooo.dagger.model.ICommonView;
import com.ooo.dagger.model.User;
import com.ooo.dagger.module.CommonModule;
import com.ooo.dagger.presenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Dongdd on 2019/9/18 0018 11:02.
 */
public class LoginActivity extends AppCompatActivity implements ICommonView {


    @BindView(R.id.btn_login)
    Button btnLogin;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        DaggerCommonComponent
                .builder()
                .commonModule(new CommonModule(this))
                .build()
                .Inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.bind(this).unbind();
    }

    @OnClick(R.id.btn_login)
    public void onClick() {
        loginPresenter.login(new User());
    }

    @Override
    public Context getContext() {
        return this;
    }


}
