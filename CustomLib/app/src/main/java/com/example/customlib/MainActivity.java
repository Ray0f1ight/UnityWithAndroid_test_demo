package com.example.customlib;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.unity3d.player.UnityPlayer;

public class MainActivity extends Activity {

    public void clickTest(){
        Log.i("MainActivity","clickTest_____");
        showToast("clickTest");
    }

    public void showToast(String content){
        Toast.makeText(UnityPlayer.currentActivity, content, Toast.LENGTH_LONG).show();
    }
}
