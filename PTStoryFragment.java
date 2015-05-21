package com.example.paer.agileproject.fragments;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.astuetz.PagerSlidingTabStrip;
import com.example.paer.agileproject.R;
import com.example.paer.agileproject.adapters.PivotalFragmentPagerAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.*;
import com.google.gson.*;
import com.google.gson.reflect.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qi on 2015/5/17.
 */


public class PTStoryFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_pivotal_tab, container, false);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pivotal_viewpager);
        viewPager.setAdapter(new PivotalFragmentPagerAdapter(getFragmentManager()));
        PagerSlidingTabStrip tabsStrip = (PagerSlidingTabStrip) view.findViewById(R.id.pivotal_tab);
        tabsStrip.setViewPager(viewPager);
        return view;
    }
}
