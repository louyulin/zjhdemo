package com.lyl.mine;

import android.content.Context;
import android.content.Intent;

import com.lyl.componentlib.IMindeService;

/**
 * Created by louyulin on 2019/7/4.
 */

public class MineService implements IMindeService {
    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent();
        intent.putExtra("id" , userId);
        intent.setClass(context , MineActivity.class);
        context.startActivity(intent);
    }
}
