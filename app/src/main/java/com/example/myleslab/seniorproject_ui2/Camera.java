package com.example.myleslab.seniorproject_ui2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Camera extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new Camera2BasicFragment().newInstance())
                    .commit();
        }
    }
}
