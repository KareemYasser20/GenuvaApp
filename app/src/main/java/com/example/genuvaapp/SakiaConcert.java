package com.example.genuvaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class SakiaConcert extends AppCompatActivity {

    ArrayList <PartyModel> concerts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sakia_concert);

        PartyModel party1 = new PartyModel();

        party1.setTeamimage(R.drawable.cairokee);
        party1.setTeamname("Cairokee");
        party1.setPartydate("24/9/2019");
        concerts.add(party1);

        PartyModel party2 = new PartyModel();

        party2.setTeamimage(R.drawable.download);
        party2.setTeamname("Cairokee");
        party2.setPartydate("24/9/2019");
        concerts.add(party2);

        PartyModel party3 = new PartyModel();

        party3.setTeamimage(R.drawable.zaptharwat);
        party3.setTeamname("Cairokee");
        party3.setPartydate("24/9/2019");
        concerts.add(party3);

        GridView Sakia_gridview = findViewById(R.id.Sakia_gridview);
        GridAdapter adapter = new GridAdapter( SakiaConcert.this, R.layout.concertsrow , concerts);

        Sakia_gridview.setAdapter(adapter);



    }
}
