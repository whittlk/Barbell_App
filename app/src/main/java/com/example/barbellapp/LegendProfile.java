package com.example.barbellapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.ValueEventListener;

public class LegendProfile extends AppCompatActivity {
    final String TAG = "LegendProfile.java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_profile);


        //Testing
        FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
        String currentUserUid = FirebaseAuth.getInstance().getCurrentUser().getUid();

        final String location = currentUserUid;
        DatabaseReference mDbRef = mDatabase.getReference();

        ChildEventListener childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                User value = dataSnapshot.child(location).getValue(User.class);

                // Fill in Text Views
                TextView fistNameText = (TextView) findViewById(R.id.firstNameText);
                fistNameText.setText(value.getFirstName());

                TextView lastNameText = (TextView) findViewById(R.id.lastNameText);
                lastNameText.setText(value.getLastName());

                TextView emailText = (TextView) findViewById(R.id.emailText);
                emailText.setText(value.getEmail());



                Log.d(TAG, "\nValue: " + value);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        };
        mDbRef.addChildEventListener(childEventListener);
    }


    // Get user Information
    // https://subscription.packtpub.com/book/web_development/9781788624718/1/ch01lvl1sec12/reading-and-writing-to-realtime-database
    // String currentUserUid = FirebaseAuth.getInstance().getCurrentUser().getUid();
}

