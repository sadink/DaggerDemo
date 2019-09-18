package com.ooo.dagger.presenter;

import android.content.Context;
import android.widget.Toast;

import com.ooo.dagger.model.ICommonView;
import com.ooo.dagger.model.User;

import javax.inject.Inject;

/**
 * 被需要依赖的类
 * 当看到某个类被@Inject标记时，就会到他的构造方法中，如果这个构造方法也被@Inject标记的话，就会自动初始化这个类，从而完成依赖注入。
 * Created by Dongdd on 2019/9/18 0018 11:11.
 */
public class LoginPresenter {

    ICommonView iView;

    /*
     * 当去实例化MainPresenter时，发现构造函数有个参数，此时会在Module里查找提供这个依赖的方法，将该View传递进去，这样就完成了presenter里View的注入。
     * @param iView
     */
    @Inject
    public LoginPresenter(ICommonView iView) {
        this.iView = iView;
    }

    public void login(User user) {
        Context context = iView.getContext();

        Toast.makeText(context, "login....", Toast.LENGTH_LONG).show();
    }
}
