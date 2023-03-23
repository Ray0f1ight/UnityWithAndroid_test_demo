package com.example.customlib;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.unity3d.player.UnityPlayer;

public class SecondActivity extends Activity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        et = (EditText) findViewById(R.id.et_title);
        findViewById(R.id.bt_complete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = et.getText().toString();
                UnityPlayer.UnitySendMessage("Title","setTitle",title);

                finish();
            }
        });
    }

    public void clickTest(){
        Log.i("MainActivity","clickTest_____");
        showToast("clickTest");
    }

    public void showToast(String content){
        Toast.makeText(UnityPlayer.currentActivity, content, Toast.LENGTH_LONG).show();
    }
}
