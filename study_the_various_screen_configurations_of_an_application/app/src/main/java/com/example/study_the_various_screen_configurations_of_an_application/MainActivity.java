package com.example.study_the_various_screen_configurations_of_an_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.study_the_various_screen_configurations_of_an_application.SwipeView_basic.SwipeView_basic;
import com.example.study_the_various_screen_configurations_of_an_application.TabView_basic.TabView_basic;

public class MainActivity extends AppCompatActivity {

    private long time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_SwipeViewBasic(View view) {
        Intent intent = new Intent(getApplicationContext(), SwipeView_basic.class);
        startActivity(intent);
    }

    public void onClick_SwipeViewTab(View view) {
        Intent intent = new Intent(getApplicationContext(), TabView_basic.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - time >= 2000) {
            time = System.currentTimeMillis();
            Toast.makeText(getApplicationContext(), "뒤로가기 버튼을 한번 더 누르면 종료합니다.", Toast.LENGTH_SHORT).show();
        } else if (System.currentTimeMillis() - time < 2000) {
            finish();
        }
    }
}
