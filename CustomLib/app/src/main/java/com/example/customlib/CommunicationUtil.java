package com.example.customlib;

import android.content.Intent;

import com.unity3d.player.UnityPlayer;

public class CommunicationUtil {

    static GotoNextCallBack callBack;

    public static void setCallBack(GotoNextCallBack cb) {
        callBack = cb;
    }

    public static void goToNextActivity(String content){
//        if(callBack!=null){
//            callBack.goToNext(content);
//        }
        UnityPlayer.currentActivity.startActivity(new Intent(UnityPlayer.currentActivity,SecondActivity.class));
    }

}
