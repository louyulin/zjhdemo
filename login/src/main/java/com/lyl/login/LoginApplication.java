package com.lyl.login;

import android.app.Application;

import com.lyl.componentlib.IAppCompant;
import com.lyl.componentlib.ServiceFactory;

/**
 * Created by louyulin on 2019/7/10.
 */

public class LoginApplication extends Application implements IAppCompant{

    public static Application application;
    public static Application getApplication(){
        return application;
    }
    //当Login是application的时候
    @Override
    public void onCreate() {
        super.onCreate();

        initializa(this);
    }

    //当Login 是Lib的时候被主app调用被赋值
    @Override
    public void initializa(Application app) {
            application = app;
        ServiceFactory.getInstance()
                .setmLoginService(new LoginService());
    }
}
