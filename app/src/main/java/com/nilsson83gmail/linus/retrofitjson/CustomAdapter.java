package com.nilsson83gmail.linus.retrofitjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.Comparator;

/**
 * Created by s060qm on 2/19/2018.
 */

public class CustomAdapter extends ArrayAdapter<String> {


    public CustomAdapter(@NonNull Context context, int resource, String[] textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    @Override
    public int getCount() {
        return 3;
    }

    /*@NonNull
    @Override
    public Filter getFilter() {
        return myFilter;
    }*/

    @Override
    public void notifyDataSetChanged() {
        this.setNotifyOnChange(false);

        this.sort(new Comparator<String>() {
            @Override
            public int compare(String lhs, String rhs) {
                return lhs.compareTo(rhs);
            }
        });

        this.setNotifyOnChange(true);
    }




}

    /*Filter myFilter = new Filter() {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            for (int i = 0; i < destination.length; i++) {

            }


            return null;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

        }
    };*/


