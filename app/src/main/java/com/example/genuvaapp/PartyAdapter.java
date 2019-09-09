package com.example.genuvaapp;

import android.content.Context;
import android.net.wifi.aware.PublishConfig;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PartyAdapter extends ArrayAdapter {

    public PartyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<PartyModel> objects) {
        super(context, resource, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.partyrow,parent,false);
        ImageView bandimage = view.findViewById(R.id.Party_team_image);
        TextView bandname= view.findViewById(R.id.team_name);
        TextView partydate = view.findViewById(R.id.party_date);
        Button book_btn = view.findViewById(R.id.book_party);
        PartyModel partyModel = (PartyModel) getItem(position);
        bandimage.setImageResource(partyModel.getTeamimage());
        bandname.setText(partyModel.getTeamname());
        partydate.setText(partyModel.getPartydate());
        book_btn.setText(partyModel.getBtn_name());

        return view;
    }

}
