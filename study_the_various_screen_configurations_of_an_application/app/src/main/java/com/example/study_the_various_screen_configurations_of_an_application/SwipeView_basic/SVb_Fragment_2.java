package com.example.study_the_various_screen_configurations_of_an_application.SwipeView_basic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.study_the_various_screen_configurations_of_an_application.R;

public class SVb_Fragment_2 extends Fragment {


    // newInstance constructor for creating fragment with arguments
    public static SVb_Fragment_2 newInstance() {
        SVb_Fragment_2 fragment = new SVb_Fragment_2();

        return fragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        return view;
    }
}