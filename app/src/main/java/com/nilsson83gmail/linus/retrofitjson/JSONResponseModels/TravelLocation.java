package com.nilsson83gmail.linus.retrofitjson.JSONResponseModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by s060qm on 2/16/2018.
 */

public class TravelLocation {

    @SerializedName("")
    @Expose
    private String travelLocation;

    public String getTravelLocation() {
        return travelLocation;
    }

    public void setTravelLocation(String travelLocation) {
        this.travelLocation = travelLocation;
    }

    @Override
    public String toString() {
        return "TravelLocation{" +
                "travelLocation='" + travelLocation + '\'' +
                '}';
    }
}
