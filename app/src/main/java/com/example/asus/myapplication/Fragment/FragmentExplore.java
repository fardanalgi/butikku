package com.example.asus.myapplication.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.myapplication.R;

public class FragmentExplore extends Fragment{

    View v;

    public FragmentExplore() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       v = inflater.inflate(R.layout.explore_fragment,container,false);
        return v;
    }
}
