package com.example.genuvaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Operafragment extends Fragment {


    ArrayList<PartyModel> operaparty = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_party, container, false);
        PartyModel partyMode2 = new PartyModel();
        partyMode2.setTeamimage(R.drawable.omarkhairat);
        partyMode2.setTeamname("Omar Khairat");
        partyMode2.setPartydate("6/9/2019");
        partyMode2.setBtn_name("Book Now");
        operaparty.add( 0, partyMode2);
        PartyModel partyModel = new PartyModel();
        partyModel.setTeamimage(R.drawable.zaptharwat);
        partyModel.setTeamname("Zap Tharwat");
        partyModel.setPartydate("28/9/2019");
        partyModel.setBtn_name("Book Now");

        for(int i =1 ; i<10 ; i++){
        operaparty.add( i, partyModel);}
        ListView partylistview= view.findViewById(R.id.Party_fragment);
        PartyAdapter partyAdapter =new PartyAdapter(getContext(),R.layout.partyrow,operaparty);
        partylistview.setAdapter(partyAdapter);
        // Inflate the layout for this fragment
        return view ;

    }
}


