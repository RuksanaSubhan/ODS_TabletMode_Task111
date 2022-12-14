package com.example.ods_tabletmode_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> modelClassArrayList;
TextView countitem;
AdapterClass adapterClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=findViewById(R.id.recyclerfragA);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Cursor cursor=new DbManager(this).readalldata();
        modelClassArrayList=new ArrayList<>();
        countitem=findViewById(R.id.countno);


        while(cursor.moveToNext())
        {

            ModelClass model=new ModelClass(cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6));
            modelClassArrayList.add(model);

        }

        AdapterClass adapter=new AdapterClass(modelClassArrayList);
        recyclerView.setAdapter(adapter);

//        int count = 0;
//        if (adapterClass != null) {
//            count = adapterClass.getItemCount();
//        }

 countitem.setText(""+adapter.modelClassList.size());


    }
}