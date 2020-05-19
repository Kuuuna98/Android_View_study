package com.example.study_the_various_screen_configurations_of_an_application.TabView_basic;


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


public class TVb_Fragment_1 extends Fragment {


    public static TVb_Fragment_1 newInstance() {
        TVb_Fragment_1 fragment = new TVb_Fragment_1();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fv = inflater.inflate(R.layout.fragment_1, container, false);
        TextView textView = fv.findViewById(R.id.page_num);
        textView.setText("첫 번째 화면");
        textView.setBackgroundColor(Color.parseColor("#ffdead"));
        return fv;
    }

}