package com.example.study_the_various_screen_configurations_of_an_application.TabView_swipe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.study_the_various_screen_configurations_of_an_application.R;

public class TVs_Fragment_2 extends Fragment {


    public static TVs_Fragment_2 newInstance() {
        TVs_Fragment_2 fragment = new TVs_Fragment_2();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fv = inflater.inflate(R.layout.fragment_1, container, false);
        TextView textView = fv.findViewById(R.id.page_num);
        textView.setText("두 번째 화면");
        textView.setBackgroundColor(Color.parseColor("#f08080"));
        return fv;
    }

}
