package com.example.genuvaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class SakiaConcerts extends AppCompatActivity {
GridView gridView;
    ArrayList<PartyModel> party = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sakia_concerts);

        gridView=findViewById(R.id.Sakia_gridview);

        


    }
}
