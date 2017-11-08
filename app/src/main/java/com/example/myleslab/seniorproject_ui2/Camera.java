package com.example.myleslab.seniorproject_ui2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class Camera extends AppCompatActivity{
    private Camera2BasicFragment camera2BasicFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            this.camera2BasicFragment = new Camera2BasicFragment().newInstance();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, camera2BasicFragment)
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.select_type, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.tshirt:
                camera2BasicFragment.fileOption = "tshirt";
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                return true;
            case R.id.pants:
                camera2BasicFragment.fileOption = "pants";
                if (item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return true;
            case R.id.shoes:
                camera2BasicFragment.fileOption = "shoes";
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return true;
            case R.id.longshirt:
                camera2BasicFragment.fileOption = "longshirt";
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return true;
            case R.id.shorts:
                camera2BasicFragment.fileOption = "shorts";
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                return true;
            default:
                camera2BasicFragment.fileOption = "other";
                return super.onOptionsItemSelected(item);
        }
    }
}
