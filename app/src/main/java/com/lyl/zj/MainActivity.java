package com.lyl.zj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lyl.componentlib.ServiceFactory;
import com.lyl.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.go_login)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ServiceFactory
                                .getInstance()
                                .getmLoginService()
                                .launch(MainActivity.this
                                , "LoginActivity");
                    }
                });

        findViewById(R.id.go_mine)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ServiceFactory.getInstance()
                                .getMindeService()
                                .launch(MainActivity.this,2);

                    }
                });
    }
}
