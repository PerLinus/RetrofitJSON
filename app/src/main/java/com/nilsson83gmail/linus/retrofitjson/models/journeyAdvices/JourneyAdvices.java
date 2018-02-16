package com.nilsson83gmail.linus.retrofitjson.models.journeyAdvices;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by s060qm on 2/13/2018.
 */

public class JourneyAdvices {

    @SerializedName("departureDateTimeAsString")
    @Expose
    private String departureDateTimeAsString;

    @SerializedName("duration")
    @Expose
    private String duration;

    public String getDepartureDateTimeAsString() {
        return departureDateTimeAsString;
    }

    public void setDepartureDateTimeAsString(String departureDateTimeAsString) {
        this.departureDateTimeAsString = departureDateTimeAsString;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "JourneyAdvices{" +
                "departureDateTimeAsString='" + departureDateTimeAsString + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
