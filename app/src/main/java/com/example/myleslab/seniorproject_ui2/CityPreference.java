package com.example.myleslab.seniorproject_ui2;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Myles on 11/1/2017.
 */

public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Nashville, TN");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
