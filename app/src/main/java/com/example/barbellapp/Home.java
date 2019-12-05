package com.example.barbellapp;

import android.content.Intent;

import androidx.multidex.MultiDexApplication;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Home extends MultiDexApplication {

    private static final String TAG = "Home";
    @Override
    public void onCreate(){
        super.onCreate();

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();


        if(firebaseUser != null){
            Intent intent = new Intent(Home.this, ProfileActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }
        else{
            Intent intent = new Intent(Home.this, LegendsMain.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}
