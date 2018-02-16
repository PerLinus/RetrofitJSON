package com.nilsson83gmail.linus.retrofitjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import com.nilsson83gmail.linus.retrofitjson.JSONResponseModels.TravelLocation;
import com.nilsson83gmail.linus.retrofitjson.JSONResponseModels.TravelLocations;
import com.nilsson83gmail.linus.retrofitjson.models.Producer;
import com.nilsson83gmail.linus.retrofitjson.models.SearchTimetable;
import com.nilsson83gmail.linus.retrofitjson.models.Timetable;
import com.nilsson83gmail.linus.retrofitjson.models.journeyAdvices.JourneyAdvices;
import com.nilsson83gmail.linus.retrofitjson.repository.APIService;
import com.nilsson83gmail.linus.retrofitjson.repository.APIUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private APIService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnGetData);
        final TextView textView = findViewById(R.id.textView);
        final AutoCompleteTextView from = findViewById(R.id.from);
        final AutoCompleteTextView to = findViewById(R.id.to);

        final String[] array = new String[10000];

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        from.setAdapter(adapter);
        to.setAdapter(adapter);

        apiService = APIUtils.getAPISErvice();

        Call<List<String>> callTravelLocations = apiService.getTravelLocations();

        callTravelLocations.enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                List<String> list = new ArrayList<>(response.body());

                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                    array[i] = list.get(i);
                }
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String, String> headerMap = new HashMap<>();
                headerMap.put("Content-Type", "application/json");

                Producer producer = new Producer("74", "SJ");
                List<Producer> list = new ArrayList<>();
                list.add(producer);
                Timetable timetable = new Timetable(from.toString(), to.toString(), list, "2018-02-02T16:05:25.271Z", "2018-02-02 17:05:25", "7");

                Call<SearchTimetable> callSearchTimetable = apiService.searchTimetable(headerMap, timetable);

                callSearchTimetable.enqueue(new Callback<SearchTimetable>() {
                    @Override
                    public void onResponse(Call<SearchTimetable> call, Response<SearchTimetable> response) {

                        ArrayList<JourneyAdvices> journeyAdvices = response.body().getJourneyAdvices();
                        String text = null;
                        for (int i = 0; i < journeyAdvices.size(); i++) {
                            text += journeyAdvices.get(i).getDuration() + "\n" +
                                    journeyAdvices.get(i).getDepartureDateTimeAsString() + "\n";
                        }

                        textView.setText(text);
                    }

                    @Override
                    public void onFailure(Call<SearchTimetable> call, Throwable t) {
                        Log.e("Fel", t.getMessage());
                    }
                });
            }
        });
    }
}
