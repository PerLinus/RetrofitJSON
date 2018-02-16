package com.nilsson83gmail.linus.retrofitjson.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nilsson83gmail.linus.retrofitjson.models.journeyAdvices.JourneyAdvices;

import java.util.ArrayList;

/**
 * Created by s060qm on 2/13/2018.
 */

public class SearchTimetable {

    @SerializedName("journeyAdvices")
    @Expose
    private ArrayList<JourneyAdvices> journeyAdvices;

    public ArrayList<JourneyAdvices> getJourneyAdvices() {
        return journeyAdvices;
    }

    public void setJourneyAdvices(ArrayList<JourneyAdvices> journeyAdvices) {
        this.journeyAdvices = journeyAdvices;
    }

    @Override
    public String toString() {
        return "SearchTimetable{" +
                "journeyAdvices=" + journeyAdvices +
                '}';
    }
}
