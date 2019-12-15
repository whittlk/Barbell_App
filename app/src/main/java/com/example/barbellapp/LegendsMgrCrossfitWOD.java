package com.example.barbellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LegendsMgrCrossfitWOD extends AppCompatActivity {

    FirebaseDatabase mDatabase;
    DatabaseReference mDatabaseReference;
    EditText workoutTitle, workoutDescription, scoringType, dateSelect;
    Button submit;
    int month, day;
    String title, description, scoring, date;
    FirebaseAuth firebaseAuth;
    private DatabaseReference db;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legends_mgr_crossfit_wod);

        db = FirebaseDatabase.getInstance().getReference();

        workoutTitle = findViewById(R.id.mbc_workout_title_input);
        workoutDescription = findViewById(R.id.mbc_workout_description_input);
        scoringType = findViewById(R.id.mbc_scoring_type_input);
        submit = findViewById(R.id.mcf_save);
        dateSelect = findViewById(R.id.mcf_date_select);
        back = findViewById(R.id.mcf_back);

        mDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mDatabase.getReference();

        firebaseAuth = FirebaseAuth.getInstance();


        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LegendsMgrCrossfitWOD.this, LegendNavigation.class));
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WODWorkoutInfo wodWoI = new WODWorkoutInfo(
                        workoutTitle.getText().toString(),
                        workoutDescription.getText().toString(),
                        scoringType.getText().toString(),
                        dateSelect.getText().toString()
                );


                switch (dateSelect.getText().toString()) {
                    case "1/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan1");
                        break;
                    case "1/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan2");
                        break;
                    case "1/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan3");
                        break;
                    case "1/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan4");
                        break;
                    case "1/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan5");
                        break;
                    case "1/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan6");
                        break;
                    case "1/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan7");
                        break;
                    case "1/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan8");
                        break;
                    case "1/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan9");
                        break;
                    case "1/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan10");
                        break;
                    case "1/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan11");
                        break;
                    case "1/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan12");
                        break;
                    case "1/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan13");
                        break;
                    case "1/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan14");
                        break;
                    case "1/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan15");
                        break;
                    case "1/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan16");
                        break;
                    case "1/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan17");
                        break;
                    case "1/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan18");
                        break;
                    case "1/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan19");
                        break;
                    case "1/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan20");
                        break;
                    case "1/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan21");
                        break;
                    case "1/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan22");
                        break;
                    case "1/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan23");
                        break;
                    case "1/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan24");
                        break;
                    case "1/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan25");
                        break;
                    case "1/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan26");
                        break;
                    case "1/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan27");
                        break;
                    case "1/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan28");
                        break;
                    case "1/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan29");
                        break;
                    case "1/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan30");
                        break;
                    case "1/31":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jan31");
                        break;
                    case "2/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb1");
                        break;
                    case "2/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb2");
                        break;
                    case "2/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb3");
                        break;
                    case "2/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb4");
                        break;
                    case "2/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb5");
                        break;
                    case "2/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb6");
                        break;
                    case "2/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb7");
                        break;
                    case "2/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb8");
                        break;
                    case "2/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb9");
                        break;
                    case "2/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb10");
                        break;
                    case "2/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb11");
                        break;
                    case "2/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb12");
                        break;
                    case "2/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb13");
                        break;
                    case "2/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb14");
                        break;
                    case "2/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb15");
                        break;
                    case "2/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb16");
                        break;
                    case "2/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb17");
                        break;
                    case "2/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb18");
                        break;
                    case "2/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb19");
                        break;
                    case "2/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb20");
                        break;
                    case "2/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb21");
                        break;
                    case "2/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb22");
                        break;
                    case "2/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb23");
                        break;
                    case "2/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb24");
                        break;
                    case "2/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb25");
                        break;
                    case "2/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb26");
                        break;
                    case "2/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb27");
                        break;
                    case "2/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb28");
                        break;
                    case "2/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Feb29");
                        break;
                    case "3/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar1");
                        break;
                    case "3/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar2");
                        break;
                    case "3/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar3");
                        break;
                    case "3/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar4");
                        break;
                    case "3/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar5");
                        break;
                    case "3/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar6");
                        break;
                    case "3/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar7");
                        break;
                    case "3/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar8");
                        break;
                    case "3/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar9");
                        break;
                    case "3/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar10");
                        break;
                    case "3/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar11");
                        break;
                    case "3/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar12");
                        break;
                    case "3/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar13");
                        break;
                    case "3/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar14");
                        break;
                    case "3/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar15");
                        break;
                    case "3/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar16");
                        break;
                    case "3/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar17");
                        break;
                    case "3/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar18");
                        break;
                    case "3/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar19");
                        break;
                    case "3/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar20");
                        break;
                    case "3/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar21");
                        break;
                    case "3/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar22");
                        break;
                    case "3/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar23");
                        break;
                    case "3/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar24");
                        break;
                    case "3/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar25");
                        break;
                    case "3/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar26");
                        break;
                    case "3/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar27");
                        break;
                    case "3/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar28");
                        break;
                    case "3/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar29");
                        break;
                    case "3/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar30");
                        break;
                    case "3/31":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Mar31");
                        break;
                    case "4/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr1");
                        break;
                    case "4/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr2");
                        break;
                    case "4/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr3");
                        break;
                    case "4/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr4");
                        break;
                    case "4/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr5");
                        break;
                    case "4/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr6");
                        break;
                    case "4/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr7");
                        break;
                    case "4/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr8");
                        break;
                    case "4/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr9");
                        break;
                    case "4/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr10");
                        break;
                    case "4/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr11");
                        break;
                    case "4/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr12");
                        break;
                    case "4/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr13");
                        break;
                    case "4/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr14");
                        break;
                    case "4/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr15");
                        break;
                    case "4/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr16");
                        break;
                    case "4/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr17");
                        break;
                    case "4/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr18");
                        break;
                    case "4/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr19");
                        break;
                    case "4/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr20");
                        break;
                    case "4/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr21");
                        break;
                    case "4/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr22");
                        break;
                    case "4/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr23");
                        break;
                    case "4/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr24");
                        break;
                    case "4/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr25");
                        break;
                    case "4/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr26");
                        break;
                    case "4/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr27");
                        break;
                    case "4/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr28");
                        break;
                    case "4/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr29");
                        break;
                    case "4/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Apr30");
                        break;
                    case "5/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May1");
                        break;
                    case "5/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May2");
                        break;
                    case "5/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May3");
                        break;
                    case "5/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May4");
                        break;
                    case "5/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May5");
                        break;
                    case "5/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May6");
                        break;
                    case "5/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May7");
                        break;
                    case "5/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May8");
                        break;
                    case "5/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May9");
                        break;
                    case "5/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May10");
                        break;
                    case "5/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May11");
                        break;
                    case "5/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May12");
                        break;
                    case "5/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May13");
                        break;
                    case "5/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May14");
                        break;
                    case "5/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May15");
                        break;
                    case "5/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May16");
                        break;
                    case "5/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May17");
                        break;
                    case "5/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May18");
                        break;
                    case "5/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May19");
                        break;
                    case "5/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May20");
                        break;
                    case "5/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May21");
                        break;
                    case "5/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May22");
                        break;
                    case "5/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May23");
                        break;
                    case "5/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May24");
                        break;
                    case "5/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May25");
                        break;
                    case "5/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May26");
                        break;
                    case "5/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May27");
                        break;
                    case "5/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May28");
                        break;
                    case "5/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May29");
                        break;
                    case "5/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May30");
                        break;
                    case "5/31":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("May31");
                        break;
                    case "6/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun1");
                        break;
                    case "6/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun2");
                        break;
                    case "6/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun3");
                        break;
                    case "6/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun4");
                        break;
                    case "6/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun5");
                        break;
                    case "6/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun6");
                        break;
                    case "6/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun7");
                        break;
                    case "6/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun8");
                        break;
                    case "6/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun9");
                        break;
                    case "6/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun10");
                        break;
                    case "6/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun11");
                        break;
                    case "6/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun12");
                        break;
                    case "6/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun13");
                        break;
                    case "6/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun14");
                        break;
                    case "6/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun15");
                        break;
                    case "6/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun16");
                        break;
                    case "6/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun17");
                        break;
                    case "6/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun18");
                        break;
                    case "6/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun19");
                        break;
                    case "6/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun20");
                        break;
                    case "6/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun21");
                        break;
                    case "6/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun22");
                        break;
                    case "6/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun23");
                        break;
                    case "6/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun24");
                        break;
                    case "6/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun25");
                        break;
                    case "6/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun26");
                        break;
                    case "6/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun27");
                        break;
                    case "6/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun28");
                        break;
                    case "6/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun29");
                        break;
                    case "6/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jun30");
                        break;
                    case "7/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul1");
                        break;
                    case "7/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul2");
                        break;
                    case "7/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul3");
                        break;
                    case "7/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul4");
                        break;
                    case "7/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul5");
                        break;
                    case "7/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul6");
                        break;
                    case "7/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul7");
                        break;
                    case "7/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul8");
                        break;
                    case "7/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul9");
                        break;
                    case "7/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul10");
                        break;
                    case "7/11":
                        ;
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul11");
                        break;
                    case "7/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul12");
                        break;
                    case "7/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul13");
                        break;
                    case "7/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul14");
                        break;
                    case "7/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul15");
                        break;
                    case "7/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul16");
                        break;
                    case "7/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul17");
                        break;
                    case "7/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul18");
                        break;
                    case "7/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul19");
                        break;
                    case "7/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul20");
                        break;
                    case "7/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul21");
                        break;
                    case "7/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul22");
                        break;
                    case "7/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul23");
                        break;
                    case "7/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul24");
                        break;
                    case "7/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul25");
                        break;
                    case "7/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul26");
                        break;
                    case "7/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul27");
                        break;
                    case "7/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul28");
                        break;
                    case "7/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul29");
                        break;
                    case "7/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul30");
                        break;
                    case "7/31":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Jul31");
                        break;
                    case "8/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug1");
                        break;
                    case "8/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug2");
                        break;
                    case "8/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug3");
                        break;
                    case "8/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug4");
                        break;
                    case "8/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug5");
                        break;
                    case "8/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug6");
                        break;
                    case "8/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug7");
                        break;
                    case "8/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug8");
                        break;
                    case "8/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug9");
                        break;
                    case "8/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug10");
                        break;
                    case "8/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug11");
                        break;
                    case "8/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug12");
                        break;
                    case "8/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug13");
                        break;
                    case "8/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug14");
                        break;
                    case "8/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug15");
                        break;
                    case "8/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug16");
                        break;
                    case "8/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug17");
                        break;
                    case "8/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug18");
                        break;
                    case "8/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug19");
                        break;
                    case "8/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug20");
                        break;
                    case "8/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug21");
                        break;
                    case "8/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug22");
                        break;
                    case "8/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug23");
                        break;
                    case "8/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug24");
                        break;
                    case "8/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug25");
                        break;
                    case "8/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug26");
                        break;
                    case "8/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug27");
                        break;
                    case "8/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug28");
                        break;
                    case "8/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug29");
                        break;
                    case "8/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug30");
                        break;
                    case "8/31":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Aug31");
                        break;
                    case "9/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep1");
                        break;
                    case "9/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep2");
                        break;
                    case "9/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep3");
                        break;
                    case "9/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep4");
                        break;
                    case "9/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep5");
                        break;
                    case "9/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep6");
                        break;
                    case "9/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep7");
                        break;
                    case "9/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep8");
                        break;
                    case "9/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep9");
                        break;
                    case "9/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep10");
                        break;
                    case "9/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep11");
                        break;
                    case "9/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep12");
                        break;
                    case "9/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep13");
                        break;
                    case "9/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep14");
                        break;
                    case "9/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep15");
                        break;
                    case "9/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep16");
                        break;
                    case "9/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep17");
                        break;
                    case "9/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep18");
                        break;
                    case "9/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep19");
                        break;
                    case "9/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep20");
                        break;
                    case "9/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep21");
                        break;
                    case "9/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep22");
                        break;
                    case "9/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep23");
                        break;
                    case "9/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep24");
                        break;
                    case "9/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep25");
                        break;
                    case "9/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep26");
                        break;
                    case "9/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep27");
                        break;
                    case "9/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep28");
                        break;
                    case "9/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep29");
                        break;
                    case "9/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Sep30");
                        break;
                    case "10/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct1");
                        break;
                    case "10/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct2");
                        break;
                    case "10/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct3");
                        break;
                    case "10/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct4");
                        break;
                    case "10/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct5");
                        break;
                    case "10/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct6");
                        break;
                    case "10/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct7");
                        break;
                    case "10/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct8");
                        break;
                    case "10/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct9");
                        break;
                    case "10/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct10");
                        break;
                    case "10/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct11");
                        break;
                    case "10/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct12");
                        break;
                    case "10/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct13");
                        break;
                    case "10/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct14");
                        break;
                    case "10/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct15");
                        break;
                    case "10/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct16");
                        break;
                    case "10/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct17");
                        break;
                    case "10/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct18");
                        break;
                    case "10/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct19");
                        break;
                    case "10/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct20");
                        break;
                    case "10/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct21");
                        break;
                    case "10/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct22");
                        break;
                    case "10/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct23");
                        break;
                    case "10/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct24");
                        break;
                    case "10/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct25");
                        break;
                    case "10/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct26");
                        break;
                    case "10/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct27");
                        break;
                    case "10/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct28");
                        break;
                    case "10/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct29");
                        break;
                    case "10/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct30");
                        break;
                    case "10/31":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Oct31");
                        break;
                    case "11/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov1");
                        break;
                    case "11/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov2");
                        break;
                    case "11/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov3");
                        break;
                    case "11/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov4");
                        break;
                    case "11/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov5");
                        break;
                    case "11/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov6");
                        break;
                    case "11/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov7");
                        break;
                    case "11/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov8");
                        break;
                    case "11/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov9");
                        break;
                    case "11/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov10");
                        break;
                    case "11/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov11");
                        break;
                    case "11/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov12");
                        break;
                    case "11/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov13");
                        break;
                    case "11/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov14");
                        break;
                    case "11/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov15");
                        break;
                    case "11/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov16");
                        break;
                    case "11/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov17");
                        break;
                    case "11/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov18");
                        break;
                    case "11/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov19");
                        break;
                    case "11/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov20");
                        break;
                    case "11/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov21");
                        break;
                    case "11/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov22");
                        break;
                    case "11/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov23");
                        break;
                    case "11/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov24");
                        break;
                    case "11/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov25");
                        break;
                    case "11/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov26");
                        break;
                    case "11/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov27");
                        break;
                    case "11/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov28");
                        break;
                    case "11/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov29");
                        break;
                    case "11/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Nov30");
                        break;
                    case "12/1":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec1");
                        break;
                    case "12/2":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec2");
                        break;
                    case "12/3":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec3");
                        break;
                    case "12/4":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec4");
                        break;
                    case "12/5":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec5");
                        break;
                    case "12/6":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec6");
                        break;
                    case "12/7":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec7");
                        break;
                    case "12/8":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec8");
                        break;
                    case "12/9":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec9");
                        break;
                    case "12/10":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec10");
                        break;
                    case "12/11":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec11");
                        break;
                    case "12/12":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec12");
                        break;
                    case "12/13":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec13");
                        break;
                    case "12/14":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec14");
                        break;
                    case "12/15":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec15");
                        break;
                    case "12/16":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec16");
                        break;
                    case "12/17":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec17");
                        break;
                    case "12/18":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec18");
                        break;
                    case "12/19":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec19");
                        break;
                    case "12/20":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec20");
                        break;
                    case "12/21":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec21");
                        break;
                    case "12/22":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec22");
                        break;
                    case "12/23":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec23");
                        break;
                    case "12/24":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec24");
                        break;
                    case "12/25":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec25");
                        break;
                    case "12/26":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec26");
                        break;
                    case "12/27":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec27");
                        break;
                    case "12/28":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec28");
                        break;
                    case "12/29":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec29");
                        break;
                    case "12/30":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec30");
                        break;
                    case "12/31":
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Dec31");
                        break;
                    default:
                        mDatabaseReference = mDatabase.getReference().child("users").child("wodPage").child("crossfit").child("Error");
                        break;
                }

                mDatabaseReference.setValue(wodWoI);
            }
        });
    }
}
