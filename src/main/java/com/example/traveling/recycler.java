package com.example.traveling;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class recycler extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private List<recycleritem> recycleritems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recycleritems=new ArrayList<>();
        for (int i=0;i<10;i++){
recycleritem recycleritem=new recycleritem("Heading"+ (i+1),"Benon and Abraham");
recycleritems.add(recycleritem);

        }
        adapter=new myadapter(recycleritems,this);
        recyclerView.setAdapter(adapter);
    }
}
