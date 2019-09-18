package com.ooo.dagger.module;

import com.ooo.dagger.model.ICommonView;
import com.ooo.dagger.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * 主要用来提供依赖
 * Module类主要是为了提供那些没有构造函数的类的依赖，这些类无法用@Inject标注，比如第三方类库，系统类，以及上面示例的View接口。
 * Modules类里面的方法专门提供依赖，所以我们定义一个类，用@Module注解，这样Dagger在构造类的实例的时候，就知道从哪里去找到需要的 依赖
 * Created by Dongdd on 2019/9/18 0018 11:19.
 */
@Module
public class CommonModule {
    private ICommonView iView;

    public CommonModule(ICommonView iView) {
        this.iView = iView;
    }

    @Provides
    @ActivityScope
    public ICommonView provideIcommonView() {
        return this.iView;
    }
}
