package com.example.genuvaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    public GridAdapter(ArrayList<PartyModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    ArrayList<PartyModel> data;
    Context context;
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view =LayoutInflater.from(context).inflate(R.layout.concertsrow, viewGroup);
        ImageView bandimage=view.findViewById(R.id.concert_band_image);
        TextView  bandname=view.findViewById(R.id.concert_band_name);
        TextView  concertdate=view.findViewById(R.id.concert_date);
        PartyModel sakiaconcet = (PartyModel) getItem(i);
        bandimage.setImageResource(data.get(i).getTeamimage());
        bandname.setText(data.get(i).getTeamname());
        concertdate.setText(sakiaconcet.getPartydate());

        return view;
    }
}
