package com.nilsson83gmail.linus.retrofitjson.repository;

import com.nilsson83gmail.linus.retrofitjson.JSONResponseModels.TravelLocations;
import com.nilsson83gmail.linus.retrofitjson.models.SearchTimetable;
import com.nilsson83gmail.linus.retrofitjson.models.Timetable;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by s060qm on 2/5/2018.
 */

public interface APIService {

    @POST("timetable/searchTimetable")
    Call<SearchTimetable> searchTimetable(@HeaderMap Map<String, String> header, @Body Timetable timetable);

    @Headers("Content-Type: application/json")
    @GET("location/normal/a/limitresult/10000")
    Call<List<String>> getTravelLocations();

}
