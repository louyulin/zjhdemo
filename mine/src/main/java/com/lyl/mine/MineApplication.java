package com.lyl.mine;

import android.app.Application;

import com.lyl.componentlib.IAppCompant;
import com.lyl.componentlib.ServiceFactory;

/**
 * Created by louyulin on 2019/7/10.
 */

public class MineApplication extends Application implements IAppCompant {

    public static Application application;
    public static Application getApplication(){
        return application;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setMindeService(new MineService());

    }
}
