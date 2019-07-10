package com.lyl.zj;

import android.app.Application;

import com.lyl.componentlib.Appconfig;
import com.lyl.componentlib.IAppCompant;

/**
 * Created by louyulin on 2019/7/10.
 */

public class MainApplication extends Application implements IAppCompant {

    private static MainApplication application;

    public  static MainApplication getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        for (String conponet : Appconfig.CONPONETS) {
            try {
                Class<?> clazz =
                        Class.forName(conponet);
                Object o = clazz.newInstance();
                if (o instanceof IAppCompant){
                    ((IAppCompant)o).initializa(this);

                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

    }
}
