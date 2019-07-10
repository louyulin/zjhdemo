package com.lyl.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.lyl.componentlib.ILoginService;

/**
 * Created by louyulin on 2019/7/4.
 */

public class LoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction()
                .add(viewId , fragment).commit();
        return fragment;
    }
}
