package com.example.study_the_various_screen_configurations_of_an_application.TabView_swipe;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.study_the_various_screen_configurations_of_an_application.R;
public class TabView_swipe extends AppCompatActivity {

    private static final String TAG = "TabView_swipe";

    private FragmentManager fragmentManager = getSupportFragmentManager();

    private TVs_Fragment_1 fragment_1 = new TVs_Fragment_1();
    private TVs_Fragment_2 fragment_2 = new TVs_Fragment_2();
    private TVs_Fragment_3 fragment_3 = new TVs_Fragment_3();
    private TVs_Fragment_4 fragment_4 = new TVs_Fragment_4();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_view_swipe);
        setBottomNavigation();
    }

    /**
     * @brief 하단 tab을 구성하는 메서드
     */
    private void setBottomNavigation() {

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragment_1.newInstance()).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.navigation_home: {
                        transaction.replace(R.id.frame_layout, fragment_1.newInstance()).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_call: {
                        transaction.replace(R.id.frame_layout, fragment_2.newInstance()).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_mail: {
                        transaction.replace(R.id.frame_layout, fragment_3.newInstance()).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_camera: {
                        transaction.replace(R.id.frame_layout, fragment_4.newInstance()).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });
    }
}
