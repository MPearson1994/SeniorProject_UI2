package com.example.myleslab.seniorproject_ui2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Miley on 12/27/2017.
 */

public class CalendarAdapter extends BaseAdapter {

    static final int FIRST_DAY_OF_THE_WEEK = 0;

    private Context mContext;

    private Calendar month;
    private Calendar selectedDate;
    private ArrayList<String> items;

    public CalendarAdapter(Context c, Calendar monthCalendar){
        month = monthCalendar;
        selectedDate = (Calendar) monthCalendar.clone();
        mContext = c;
        month.set(Calendar.DAY_OF_MONTH, 1);
        this.items = new ArrayList<String>();
        refreshDays();
    }

    public void setItems(ArrayList<String> items) {
        for(int i = 0;i != items.size();i++){
            if(items.get(i).length()==1) {
                items.set(i, "0" + items.get(i));
            }
        }
        this.items = items;
    }

    @Override
    public int getCount() {
        return days.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    // create a new view for each item referenced by the Adapter

    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        TextView dayView;

        if (convertView == null) {  // if it's not recycled, initialize some attributes
            LayoutInflater layoutInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = layoutInflater.inflate(R.layout.calendar_item, null);
        }

        dayView = (TextView) v.findViewById(R.id.date);

        // disable empty days from the beginning
        if(days[position].equals("")) {
            dayView.setClickable(false);
            dayView.setFocusable(false);
        }

        dayView.setText(days[position]);

        // create date string for comparison
        String date = days[position];

        if(date.length() == 1) {
            date = "0" + date;
        }

        String monthString = "" + (month.get(Calendar.MONTH) + 1);

        if(monthString.length() == 1) {
            monthString = "0" + monthString;
        }

        return v;
    }



    public void refreshDays() {
        // clear items
        items.clear();

        int lastDay = month.getActualMaximum(Calendar.DAY_OF_MONTH);

        int firstDay = (int)month.get(Calendar.DAY_OF_WEEK);

        // figure size of the array
        if(firstDay == 1){
            days = new String[lastDay + (FIRST_DAY_OF_THE_WEEK * 6)];
        }

        else {
            days = new String[lastDay + firstDay - (FIRST_DAY_OF_THE_WEEK + 1)];
        }

        int j = FIRST_DAY_OF_THE_WEEK;
        // populate empty days before first real day

        if(firstDay>1) {
            for( j = 0 ; j < firstDay - FIRST_DAY_OF_THE_WEEK ; j++) {
                days[j] = "";
            }
        }

        else {
            for( j = 0 ; j < FIRST_DAY_OF_THE_WEEK * 6 ; j++) {
                days[j] = "";
            }

            j = FIRST_DAY_OF_THE_WEEK *6+1; // sunday => 1, monday => 7
        }

        // populate days
        int dayNumber = 1;

        for(int i = j - 1 ; i < days.length; i++) {
            days[i] = "" + dayNumber;
            dayNumber++;
        }
    }

    // references to our items
    public String[] days;
}
