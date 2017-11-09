package com.example.myleslab.seniorproject_ui2;

import java.io.File;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import me.relex.circleindicator.CircleIndicator;

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
        init();
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
    public void getFromCache() {
        Pattern pat = Pattern.compile("[0-9]+\.jpg");
        Matcher


        File file= new File(android.os.Environment.getExternalStorageDirectory(),"files/pic_"+getFileName()+"_"+ );

        if (file.isDirectory())
        {
             = file.listFiles();


            for (int i = 0; i < listFile.length; i++)
            {

                f.add(listFile[i].getAbsolutePath());

            }
        }
    }

    private void init() {
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new PageAdapter(ViewClothing.this,arrayList));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == images.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);

}
