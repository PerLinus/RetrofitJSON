package com.nilsson83gmail.linus.retrofitjson.repository;

/**
 * Created by s060qm on 2/16/2018.
 */

public class APIUtils {

    public APIUtils() {
    }

    private static final String BASE_URL = "http://bella.linkon.se:9083/will/api/rest/";

    public static APIService getAPISErvice() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);

    }


}
