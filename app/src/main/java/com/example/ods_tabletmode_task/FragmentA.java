package com.example.ods_tabletmode_task;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;


public class FragmentA extends Fragment {



    public FragmentA() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_a, container, false);
//
//      TextView textView =root.findViewById(R.id.displayname);
//        Bundle bundle = this.getArguments();
//        String data = bundle.getString("key");
//        textView.setText(data);


        return root;
    }
}