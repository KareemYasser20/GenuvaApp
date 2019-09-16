package com.example.genuvaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Blankfragment extends Fragment {

    ArrayList<PartyModel> party = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_party, container, false);
        final ListView partylistview= view.findViewById(R.id.Party_fragment);
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
         String partykey =database.push().getKey();

         PartyModel Party1 = new PartyModel(10, "Cairokee" , "24/9/2019" ,  partykey , "80" , "50" , "40"  );
        database.child("Sakia").child(partykey).setValue(Party1);

        PartyModel Party2 = new PartyModel(10, "Amr " , "28/9/2019" ,  partykey , "120" , "80" , "70"  );
        database.child("Sakia").child(partykey).setValue(Party2);

        database.child("Sakia").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot Snapshot: dataSnapshot.getChildren()
                     ) {
                    PartyModel getvalue = Snapshot.getValue(PartyModel.class);
                    party.add(getvalue);

                }

                PartyAdapter partyAdapter =new PartyAdapter(getContext(),R.layout.partyrow,party);
                partylistview.setAdapter(partyAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        // Inflate the layout for this fragment
        return view ;

    }
}
