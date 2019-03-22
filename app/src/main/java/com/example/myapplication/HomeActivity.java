package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private List<Card_Class> card ;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card = new ArrayList<>();
        card.add(new Card_Class(R.drawable.ic_imge_card,"Card of the wedding",10));

        recyclerView = findViewById(R.id.recyclerview);
        Adapter      = new RecyclerViewAdapter(this , card);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        
    }
}
