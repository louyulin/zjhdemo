package com.lyl.componentlib;

/**
 * Created by louyulin on 2019/7/10.
 */

public class ServiceFactory {

    private static final ServiceFactory
     instance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return  instance;
    }

    private ServiceFactory() {}

    private ILoginService mLoginService;

    private IMindeService mindeService;

    public ILoginService getmLoginService() {
        return mLoginService;
    }

    public void setmLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMindeService getMindeService() {
        return mindeService;
    }

    public void setMindeService(IMindeService mindeService) {
        this.mindeService = mindeService;
    }
}
