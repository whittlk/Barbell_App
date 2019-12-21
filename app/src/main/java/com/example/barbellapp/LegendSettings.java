package com.example.barbellapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LegendSettings extends AppCompatActivity {

    EditText fName, lName;
    Button submit, profilePhoto, signOut;
    ImageButton back;
    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabaseReference = mDatabase.getReference();
    FirebaseAuth firebaseAuth;
    private DatabaseReference db;
    String currentUserUid, email, admin;
    CheckBox isAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_settings);


        fName = findViewById(R.id.lsFirstName);
        lName = findViewById(R.id.lsLastName);
        submit = findViewById(R.id.lsSubmit);
        profilePhoto = findViewById(R.id.lsChangePhoto);
        signOut = findViewById(R.id.lsSignOut);
        back = findViewById(R.id.lsBack);
        isAdmin = findViewById(R.id.lsAdmin);
        currentUserUid =FirebaseAuth.getInstance().getCurrentUser().getUid();

                firebaseAuth = FirebaseAuth.getInstance();

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                readDatabase();
                User user = new User(fName.getText().toString(), lName.getText().toString(), email, admin);
                mDatabaseReference = mDatabase.getReference().child("users").child(currentUserUid);
                mDatabaseReference.setValue(user);
            }
        });

        profilePhoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(LegendSettings.this, "Feature Not Available", Toast.LENGTH_LONG).show();
            }
        });

        signOut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(LegendSettings.this, LegendsMain.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendSettings.this, LegendNavigation.class));
            }
        });


    }

    private final void readDatabase(){

        mDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                getData(dataSnapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void getData(DataSnapshot dataSnapshot) {
        for(DataSnapshot ds : dataSnapshot.getChildren()){
            UserInformation userInfo = new UserInformation();
            userInfo.setEmail(ds.child(currentUserUid).getValue(UserInformation.class).getEmail());
            email = userInfo.getEmail();
            userInfo.setAdmin(ds.child(currentUserUid).getValue(UserInformation.class).getAdmin());
            admin = userInfo.getAdmin();
        }
    }
}
