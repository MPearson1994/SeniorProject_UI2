package com.example.myleslab.seniorproject_ui2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class Camera extends Activity{
    FragmentActivity fragmentActivity = Camera2BasicFragment.newInstance().getActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            fragmentActivity.getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }
}
