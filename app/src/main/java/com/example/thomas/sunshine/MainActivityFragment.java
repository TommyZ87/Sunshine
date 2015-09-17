package com.example.thomas.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        List<String> Weather = Arrays.asList(
                "Today - Sunny - 75/75",
                "Tomorrow - Foggy - 87/78",
                "Wednesday - Misty - 70/50",
                "Thursday - Raining -60/50",
                "Friday - Oblivion - 1200000/0",
                "Saturday - No Weather - 0k/0k",
                "Sunday - Sleeping - 12/12"
        );

        //Change the above list to aWeather and then do the below to get a list of days of destruction
//        ArrayList<String> Weather = new ArrayList<String>(aWeather);
//
//        for(int i = 0; i<100; i++)
//        {
//            Weather.add("Day " + i + " - desturction - 0k/0k");
//        }

        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                Weather
        );

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
