package com.example.genuvaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class ConcertPlace extends AppCompatActivity {
CardView SakiaConcret , OperaConcret ;
ImageView Sakia, Opera;
Button myticket , logout , controlpanel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_place);
        SakiaConcret =findViewById(R.id.Sakia_place);
        OperaConcret=findViewById(R.id.Opera_cardview);
        Sakia=findViewById(R.id.Skia_image);
        Opera=findViewById(R.id.opera_image);
        myticket=findViewById(R.id.myticket_btn);
        logout=findViewById(R.id.logout_btn);
        controlpanel=findViewById(R.id.control_panel_btn);
        

    }
}
