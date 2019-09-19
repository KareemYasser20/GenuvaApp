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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.ArrayList;

public class SakiaConcert extends AppCompatActivity {

    ArrayList <PartyModel> concerts = new ArrayList<>();

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference();
    StorageReference storageRef = FirebaseStorage.getInstance().getReference();
    String imgeUrl;
    String randamid=reference.push().getKey();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        PartyModel Cairokee_concert = new PartyModel(imgeUrl, "Cairokee" , "7 PM, 26 April" , randamid , "200" , "100" , "80");

        reference.child("Sakia").child(randamid).setValue(Cairokee_concert);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sakia_concert);

        PartyModel party1 = new PartyModel();

//        party1.setPartyCoverImage(R.drawable.cairokee);
        party1.setPartyName("Cairokee");
        party1.setPartyTime("24/9/2019");
        concerts.add(party1);

        PartyModel party2 = new PartyModel();

//        party2.setTeamimage(R.drawable.download);
        party2.setPartyName("Cairokee");
        party2.setPartyTime("24/9/2019");
        concerts.add(party2);

        PartyModel party3 = new PartyModel();

//        party3.setTeamimage(R.drawable.zaptharwat);
        party3.setPartyName("Cairokee");
        party3.setPartyTime("24/9/2019");
        concerts.add(party3);

        GridView Sakia_gridview = findViewById(R.id.Sakia_gridview);
        GridAdapter adapter = new GridAdapter( SakiaConcert.this, R.layout.concertsrow , concerts);

        Sakia_gridview.setAdapter(adapter);



    }

    public void selectimage(){
        Intent pickphoto = new Intent(Intent.ACTION_PICK);
        pickphoto.setType("image/*");
        startActivityForResult(pickphoto , 10);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode==RESULT_OK && data!=null ){
            Uri imageUri = data.getData();
            uploadphoto(imageUri);
        }

    }

    private void uploadphoto (Uri uri) {

        storageRef.child("photos").child(randamid).putFile(uri).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                if(task.isSuccessful()){
                    Toast.makeText(SakiaConcert.this, "upload sucsses", Toast.LENGTH_SHORT).show();
                    storageRef.child("photos").child(randamid).getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                        @Override
                        public void onComplete(@NonNull Task<Uri> task) {
                             imgeUrl= task.getResult().toString();

                        }
                    });
                }
            }
        });

    }

}
