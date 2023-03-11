package com.example.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.unity3d.player.UnityPlayer;

public class LocalActivity extends Activity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
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
}