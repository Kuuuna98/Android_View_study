package com.example.study_the_various_screen_configurations_of_an_application.TabView_swipe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.study_the_various_screen_configurations_of_an_application.R;

public class TVs_Fragment_1_swipe2 extends Fragment {


    public static TVs_Fragment_1_swipe2 newInstance() {
        TVs_Fragment_1_swipe2 fragment = new TVs_Fragment_1_swipe2();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fv = inflater.inflate(R.layout.fragment_swipe_1, container, false);
        TextView textView = fv.findViewById(R.id.pageSwipe_num);
        textView.setText("화면2");
        return fv;
    }

}

