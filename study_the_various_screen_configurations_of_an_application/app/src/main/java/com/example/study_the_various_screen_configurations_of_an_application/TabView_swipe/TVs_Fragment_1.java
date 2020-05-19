package com.example.study_the_various_screen_configurations_of_an_application.TabView_swipe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.study_the_various_screen_configurations_of_an_application.R;

import java.util.ArrayList;
import java.util.List;

public class TVs_Fragment_1 extends Fragment {

    ViewPager viewPager;
    TabLayout tabLayout;

    public static TVs_Fragment_1 newInstance() {
        TVs_Fragment_1 fragment = new TVs_Fragment_1();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fv = inflater.inflate(R.layout.fragment_swipe_main, container, false);

        viewPager = (ViewPager) fv.findViewById(R.id.viewpager);
        tabLayout = (TabLayout) fv.findViewById(R.id.tab);

        return fv;
    }

    /**
     * @brief 화면 중간 3가지 프래그먼트 설정
     */

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tabLayout.setupWithViewPager(viewPager, true);

        setupViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());

        viewPagerAdapter.addFragment(new TVs_Fragment_1_swipe1().newInstance(), "");
        viewPagerAdapter.addFragment(new TVs_Fragment_1_swipe2().newInstance(), "");
        viewPagerAdapter.addFragment(new TVs_Fragment_1_swipe3().newInstance(), "");

        viewPager.setAdapter(viewPagerAdapter);
    }


    private class ViewPagerAdapter extends FragmentPagerAdapter {

        List<Fragment> fragmentList = new ArrayList<>();
        List<String> fragmentTitles = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitles.get(position);
        }

        public void addFragment(Fragment fragment, String name) {
            fragmentList.add(fragment);
            fragmentTitles.add(name);
        }
    }
}