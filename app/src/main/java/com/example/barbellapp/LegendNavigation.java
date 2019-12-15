package com.example.barbellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LegendNavigation extends AppCompatActivity {

    TextView crossfit, strResults, workResults, bootcampResults, crossfitResults, settings,
        setCrossfitWOD, setBootcampWOD;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_navigation);

        crossfit = findViewById(R.id.lnCrossfit);
        strResults = findViewById(R.id.lnStrengthResults);
        workResults = findViewById(R.id.lnWorkoutResults);
        bootcampResults = findViewById(R.id.lnBootcampResults);
        crossfitResults = findViewById(R.id.lnCrossfitResults);
        settings = findViewById(R.id.lnSettings);
        setCrossfitWOD = findViewById(R.id.setCFWOD);
        setBootcampWOD = findViewById(R.id.lnSetBCWOD);
        back = findViewById(R.id.lnBackButton);

        crossfit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendCrossfit.class));
            }
        });

        strResults.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendsAddStrength.class));
            }
        });

        workResults.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendsAddWorkout.class));
            }
        });

        bootcampResults.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendsBootcampWODResults.class));
            }
        });

        crossfitResults.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendsCrossfitWODResults.class));
            }
        });

        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendSettings.class));
            }
        });

        setBootcampWOD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendsMgrBootcampWOD.class));
            }
        });

        setCrossfitWOD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendsMgrCrossfitWOD.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendNavigation.this, LegendsHome.class));
            }
        });
    }
}
