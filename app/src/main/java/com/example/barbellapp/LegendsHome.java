package com.example.barbellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LegendsHome extends AppCompatActivity {

    FloatingActionButton fabMain, fabStrength, fabWorkout;
    Float translationY = 100f;
    Boolean fabOpen = false;
    OvershootInterpolator interpolator = new OvershootInterpolator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legends_home);
    }

}
