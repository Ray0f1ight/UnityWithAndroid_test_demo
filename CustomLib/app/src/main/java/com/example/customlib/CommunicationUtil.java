package com.example.customlib;

public class CommunicationUtil {

    static GotoNextCallBack callBack;

    public static void setCallBack(GotoNextCallBack cb) {
        callBack = cb;
    }

    public static void goToNextActivity(String content){
        if(callBack!=null){
            callBack.goToNext(content);
        }
    }

}
