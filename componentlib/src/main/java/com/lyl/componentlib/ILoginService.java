package com.lyl.componentlib;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by louyulin on 2019/7/4.
 */

public interface ILoginService {

    //跳转 从主App跳转到LoginApp
    void launch(Context context, String targetClass);
    //获取数据 app 从 loginapp 获取返回数据
    Fragment newUserInfoFragment(FragmentManager fragmentManager,
                                 int viewId, Bundle bundle);
}
