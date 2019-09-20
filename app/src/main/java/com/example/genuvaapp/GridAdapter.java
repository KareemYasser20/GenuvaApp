package com.example.genuvaapp;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class GridAdapter extends ArrayAdapter {


    public GridAdapter(@NonNull Context context, int resource, @NonNull ArrayList<PartyModel> objects) {
        super(context, resource, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.concertsrow , parent , false);
        ImageView bandimage = view.findViewById(R.id.concert_band_image);
        TextView  bandname = view.findViewById(R.id.concert_band_name);
        TextView  concertdate= view.findViewById(R.id.concert_date);
        PartyModel concertmodel = (PartyModel) getItem(position);
//        bandimage.setImageResource(concertmodel.getPartyCoverImage());
        bandname.setText(concertmodel.getPartyName());
        concertdate.setText(concertmodel.getPartyTime());
        return view;
    }
}
