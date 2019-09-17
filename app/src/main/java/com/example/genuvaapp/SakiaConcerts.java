package com.example.genuvaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class SakiaConcerts extends AppCompatActivity {
GridView gridView;

    ArrayList<PartyModel> Concerts=new ArrayList<>();


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_sakia_concerts,container,false);
        PartyModel newparty = new PartyModel();
        PartyModel newparty2 = new PartyModel();
        PartyModel newparty3 = new PartyModel();
        newparty.setTeamimage(R.drawable.cairokee);
        newparty.setTeamname("cairokee");
        newparty.setPartydate( "29/4/2019");
        Concerts.add(newparty);
        newparty2.setTeamimage(R.drawable.cairokee);
        newparty2.setTeamname("cairokee");
        newparty2.setPartydate( "29/4/2019");
        Concerts.add(newparty2);
        newparty3.setTeamimage(R.drawable.cairokee);
        newparty3.setTeamname("cairokee");
        newparty3.setPartydate( "29/4/2019");
               // (R.drawable.cairokee, "cairokee" , "29/4/2019", "1", "100", "100", "100");
        Concerts.add(newparty3);

        GridView gridView1 = view.findViewById(R.id.Sakia_gridview);
      return view;





    }
}
