package com.nilsson83gmail.linus.retrofitjson.models;

/**
 * Created by s060qm on 2/5/2018.
 */

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Timetable {

    @SerializedName("fromLocationName")
    @Expose
    private String fromLocationName;
    @SerializedName("toLocationName")
    @Expose
    private String toLocationName;
    @SerializedName("producers")
    @Expose
    private List<Producer> producers = null;
    @SerializedName("travelDate")
    @Expose
    private String travelDate;
    @SerializedName("travelDateAsString")
    @Expose
    private String travelDateAsString;
    @SerializedName("maxNumberOfChanges")
    @Expose
    private String maxNumberOfChanges;

    public Timetable(String fromLocationName, String toLocationName, List<Producer> producers, String travelDate, String travelDateAsString, String maxNumberOfChanges) {
        this.fromLocationName = fromLocationName;
        this.toLocationName = toLocationName;
        this.producers = producers;
        this.travelDate = travelDate;
        this.travelDateAsString = travelDateAsString;
        this.maxNumberOfChanges = maxNumberOfChanges;
    }

    public String getFromLocationName() {
        return fromLocationName;
    }

    public void setFromLocationName(String fromLocationName) {
        this.fromLocationName = fromLocationName;
    }

    public String getToLocationName() {
        return toLocationName;
    }

    public void setToLocationName(String toLocationName) {
        this.toLocationName = toLocationName;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getTravelDateAsString() {
        return travelDateAsString;
    }

    public void setTravelDateAsString(String travelDateAsString) {
        this.travelDateAsString = travelDateAsString;
    }

    public String getMaxNumberOfChanges() {
        return maxNumberOfChanges;
    }

    public void setMaxNumberOfChanges(String maxNumberOfChanges) {
        this.maxNumberOfChanges = maxNumberOfChanges;
    }

}


