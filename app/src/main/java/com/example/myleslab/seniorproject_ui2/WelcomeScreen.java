package com.example.myleslab.seniorproject_ui2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome_screen);

        Button start = findViewById(R.id.startButton);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nScreen = new Intent( WelcomeScreen.this, CardView_Menu.class);
                startActivity(nScreen);
            }
        });
    }
}
