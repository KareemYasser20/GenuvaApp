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
        View view= LayoutInflater.from(getContext()).inflate(R.layout.concertsrow,parent,false);
        ImageView bandimage = view.findViewById(R.id.concert_band_image);
        TextView bandname= view.findViewById(R.id.concert_band_name);
        TextView partydate = view.findViewById(R.id.concert_date);
        PartyModel partyModel = (PartyModel) getItem(position);
        bandimage.setImageResource(partyModel.getTeamimage());
        bandname.setText(partyModel.getTeamname());
        partydate.setText(partyModel.getPartydate());

        return view;
    }

}
