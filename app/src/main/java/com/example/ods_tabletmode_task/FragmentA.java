package com.example.ods_tabletmode_task;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class FragmentA extends Fragment {


    public FragmentA() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_a, container, false);

//        root.setBackgroundColor(Color.WHITE);
//        listView=root.findViewById(R.id.recyclerfragA);
//        adapterClass=new AdapterClass(getActivity(), R.layout.custom_recycler,modellist);
//        listView.setAdapter(arrayAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Bundle bundle=new Bundle();
//                String value=arrayAdapter.getItem(i).toString();
//                bundle.putString("key",value);
//                TwoFragment fragment=new TwoFragment();
//                fragment.setArguments(bundle);
//                getFragmentManager().beginTransaction().replace(R.id.container_frame,fragment).commit();
//            }
//        });


        return root;
    }
}