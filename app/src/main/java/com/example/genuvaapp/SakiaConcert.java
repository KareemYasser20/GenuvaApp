package com.example.genuvaapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.ArrayList;

public class SakiaConcert extends AppCompatActivity {

    ArrayList <PartyModel> concerts = new ArrayList<>();
    DatabaseReference realtimeRef = FirebaseDatabase.getInstance().getReference();
    GridView Sakia_gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sakia_concert);
        Sakia_gridview = findViewById(R.id.Sakia_gridview);



        realtimeRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Showdata(dataSnapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });







    }

    private void Showdata(DataSnapshot dataSnapshot) {
        for (DataSnapshot shot: dataSnapshot.child("Sakia").getChildren()
             ) {
            PartyModel Party = shot.getValue(PartyModel.class);
            concerts.add(Party);

            
        }

        GridAdapter adapter = new GridAdapter( SakiaConcert.this, R.layout.concertsrow , concerts);
        Sakia_gridview.setAdapter(adapter);
        
    }

}
