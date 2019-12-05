package com.example.barbellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LegendsHome extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabMain, fabStrength, fabWorkout;
    Float translationY = 100f;
    Boolean fabOpen = false;
    OvershootInterpolator interpolator = new OvershootInterpolator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legends_home);

        initFabMenu();
    }

    private void initFabMenu() {
        fabMain = findViewById(R.id.lh_fab_main);
        fabStrength = findViewById(R.id.lh_fab_strength);
        fabWorkout = findViewById(R.id.lh_fab_workout);

        fabMain.setAlpha(1f);
        fabStrength.setAlpha(0f);
        fabWorkout.setAlpha(0f);

        fabStrength.setTranslationY(translationY);
        fabWorkout.setTranslationY(translationY);

        fabMain.setOnClickListener(this);
        fabStrength.setOnClickListener(this);
        fabWorkout.setOnClickListener(this);
    }

    private void openFab(){
        fabOpen = !fabOpen;

        fabMain.animate().setInterpolator(interpolator).rotation(45f).setDuration(300).start();
        fabStrength.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        fabWorkout.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
    }

    private void closeFab(){
        fabOpen = !fabOpen;

        fabMain.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
        fabStrength.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        fabWorkout.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lh_fab_main:
                if (fabOpen){
                    closeFab();
                }else {
                    openFab();
                }
                break;
            case R.id.lh_fab_strength:
                startActivity(new Intent(LegendsHome.this, LegendsAddStrength.class));
                break;
            case R.id.lh_fab_workout:
                startActivity(new Intent(LegendsHome.this, LegendsAddWorkout.class));
                break;
        }
    }
}
