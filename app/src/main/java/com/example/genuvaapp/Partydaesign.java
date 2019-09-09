package com.example.genuvaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Partydaesign extends AppCompatActivity implements View.OnClickListener {
    Button sakiabutton , opreabutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partydaesign);
        sakiabutton=findViewById(R.id.Skia_btn);
        opreabutton=findViewById(R.id.opera_btn);
        sakiabutton.setOnClickListener(this);
        opreabutton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Fragment selectFragment = null;
        switch (view.getId()) {
            case R.id.Skia_btn:
                selectFragment = new Blankfragment();
                break;
            case R.id.opera_btn:
                selectFragment = new Operafragment();
                break;
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, selectFragment).commit();
    }
}
