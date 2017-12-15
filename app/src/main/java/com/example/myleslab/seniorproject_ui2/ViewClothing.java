package com.example.myleslab.seniorproject_ui2;

import java.io.File;
import java.util.ArrayList;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ViewClothing extends AppCompatActivity {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final File[] images = null;
    private ArrayList<String> arrayList = new ArrayList<String>();
    MenuItem item;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.select_type, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_clothing);
    }

    public String getFileName(){
        switch (item.getItemId()) {
            case R.id.tshirt:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                return "tshirt";
            case R.id.pants:
                if (item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return "pants";
            case R.id.shoes:
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return "shoes";
            case R.id.longshirt:
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return "longshirt";
            case R.id.shorts:
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return "shorts";
            case R.id.other:
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return "other";
            default:
                return "tshirt";
        }
    }
}
