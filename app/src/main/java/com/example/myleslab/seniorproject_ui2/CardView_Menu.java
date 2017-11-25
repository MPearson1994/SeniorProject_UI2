package com.example.myleslab.seniorproject_ui2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class CardView_Menu extends Activity {

    CardView calendarCard, cameraCard, favoritesCard, settingsCard, weatherCard,
            closetCard;
    Intent nScreen;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentcard_view);

        calendarCard = (CardView) findViewById(R.id.calendar_card);
        favoritesCard = (CardView) findViewById(R.id.favorites_card);
        settingsCard = (CardView) findViewById(R.id.settings_card);
        weatherCard = (CardView) findViewById(R.id.weather_card);
        cameraCard = (CardView) findViewById(R.id.camera_card);
        closetCard = (CardView) findViewById(R.id.closet_card);

        cameraCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nScreen = new Intent(CardView_Menu.this, Camera.class);
                startActivity(nScreen);
            }
        });

        weatherCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nScreen = new Intent( CardView_Menu.this, Weather.class);
                startActivity(nScreen);
            }
        });

        closetCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                nScreen = new Intent(CardView_Menu.this, ViewCloset.class);
                startActivity(nScreen);
            }
        });

        calendarCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        favoritesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        settingsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
