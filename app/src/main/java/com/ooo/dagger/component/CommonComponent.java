package com.ooo.dagger.component;

import com.ooo.dagger.module.CommonModule;
import com.ooo.dagger.scope.ActivityScope;
import com.ooo.dagger.ui.activity.LoginActivity;

import dagger.Component;

/**
 * Components从根本上来说就是一个注入器，也可以说是@Inject和@Module的桥梁，它的主要作用就是连接这两个部分。
 * Created by Dongdd on 2019/9/18 0018 11:25.
 */
@ActivityScope
@Component(modules = CommonModule.class)
public interface CommonComponent {

    void Inject(LoginActivity activity);

}
