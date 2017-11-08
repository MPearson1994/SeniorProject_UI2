package com.example.myleslab.seniorproject_ui2;

import android.os.Bundle;
import android.app.Activity;

public class ViewCloset extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closet);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
