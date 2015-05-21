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
   //String urlProject = "https://www.pivotaltracker.com/services/v5/projects/" + PivotalTrackerFragment.choosenProjectId + "/stories?token=" + PivotalTrackerFragment.token;
    String urlProject = "https://www.pivotaltracker.com/services/v5/projects/1313008/stories?token=64ae3fa63bd077840e44e878dc1c905f";

    String error1;
    ListView currentList;
    ListView backlogList;
    ListView iceboxList;
    ArrayAdapter<String> currentAdapter;
    ArrayAdapter<String> backlogAdapter;
    ArrayAdapter<String> iceboxAdapter;
    ArrayList<String> currentItems = new ArrayList<String>();



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_pivotal_tab, container, false);

       // backlogList = (ListView) view.findViewById(R.id.ptBacklogList);
       // iceboxList = (ListView) view.findViewById(R.id.ptIceboxList);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pivotal_viewpager);
        viewPager.setAdapter(new PivotalFragmentPagerAdapter(getFragmentManager()));
        PagerSlidingTabStrip tabsStrip = (PagerSlidingTabStrip) view.findViewById(R.id.pivotal_tab);
        tabsStrip.setViewPager(viewPager);
        return view;
    }


}
