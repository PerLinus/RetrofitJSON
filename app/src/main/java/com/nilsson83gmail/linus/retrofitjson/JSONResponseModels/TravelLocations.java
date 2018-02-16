package com.nilsson83gmail.linus.retrofitjson.JSONResponseModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s060qm on 2/16/2018.
 */

public class TravelLocations {

    @SerializedName("")
    @Expose
    private List<TravelLocation> travelLocations = new ArrayList<>();

    public List<TravelLocation> getTravelLocations() {
        return travelLocations;
    }

    public void setTravelLocations(List<TravelLocation> travelLocations) {
        this.travelLocations = travelLocations;
    }

    @Override
    public String toString() {
        return "TravelLocations{" +
                "travelLocations=" + travelLocations +
                '}';
    }
}
