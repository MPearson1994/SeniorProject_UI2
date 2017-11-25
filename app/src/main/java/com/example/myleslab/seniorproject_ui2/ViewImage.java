package com.example.myleslab.seniorproject_ui2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class ViewImage extends Activity {
	// Declare Variable
	TextView text;
	ImageView imageview;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from view_image.xml
		setContentView(R.layout.view_image);

		// Retrieve data from MainActivity on GridView item click
		Intent i = getIntent();

		// Get the position
		int position = i.getExtras().getInt("position");

		// Get String arrays FilePathStrings
		String[] filepath = i.getStringArrayExtra("filepath");

		// Get String arrays FileNameStrings
		String[] filename = i.getStringArrayExtra("filename");

		// Locate the TextView in view_image.xml
		text = (TextView) findViewById(R.id.imagetext);

		// Load the text into the TextView followed by the position
		text.setText(filename[position]);

		// Locate the ImageView in view_image.xml
		imageview = (ImageView) findViewById(R.id.full_image_view);

		Glide.with(this)
				.load(filepath[position])
				.diskCacheStrategy(DiskCacheStrategy.ALL)
				.into(imageview);

	}
}