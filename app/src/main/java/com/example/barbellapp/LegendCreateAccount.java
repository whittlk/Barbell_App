package com.example.barbellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LegendCreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_create_account);

        EditText fName;
        EditText lName;
        EditText email;

        fName = findViewById(R.id.first_name_input);
    }
}
