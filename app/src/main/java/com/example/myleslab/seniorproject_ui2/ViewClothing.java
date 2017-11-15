package com.example.myleslab.seniorproject_ui2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ViewClothing extends AppCompatActivity {
    private final String imagePaths[] = {
            "Image1",
            "Image2",
            "Image3",
            "Image4",
            "Image5",
            "Image6",
            "Image7",
            "Image8",
    };

    private final Integer image_ids[] =  {
            R.mipmap.image1,
            R.mipmap.image2,
            R.mipmap.image3,
            R.mipmap.image4,
            R.mipmap.image5,
            R.mipmap.image6,
            R.mipmap.image7,
            R.mipmap.image8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_clothing);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 3);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<GalleryCell> galleryCells = prepareData();
        GalleryAdapter adapter = new GalleryAdapter(getApplicationContext(), galleryCells);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<GalleryCell> prepareData(){
        ArrayList<GalleryCell> images = new ArrayList<>();
        for(int i = 0; i < imagePaths.length; i++){
            GalleryCell cell = new GalleryCell();
            cell.setTitle(imagePaths[i]);
            cell.setImage(image_ids[i]);
            images.add(cell);
        }
        return images;
    }
}
