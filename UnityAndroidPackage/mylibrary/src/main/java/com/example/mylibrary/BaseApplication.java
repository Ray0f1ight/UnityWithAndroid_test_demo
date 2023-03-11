package com.example.mylibrary;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.example.customlib.CommunicationUtil;
import com.example.customlib.GotoNextCallBack;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v("BaseApplication","onCreate()");
        CommunicationUtil.setCallBack(new GotoNextCallBack() {
            @Override
            public void goToNext(String s) {
                Intent intent = new Intent(BaseApplication.this,LocalActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}
