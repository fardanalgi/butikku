package com.example.asus.myapplication.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asus.myapplication.Adapter.ViewPagerAdapter;
import com.example.asus.myapplication.Fragment.FragmentAbout;
import com.example.asus.myapplication.Fragment.FragmentExplore;
import com.example.asus.myapplication.Fragment.FragmentHome;
import com.example.asus.myapplication.R;

public class Tampil extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment
        adapter.AddFragment(new FragmentHome(),"");
        adapter.AddFragment(new FragmentExplore(),"");
        adapter.AddFragment(new FragmentAbout(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //set icon
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_explore);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_person);

        //menghapus shadow actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
