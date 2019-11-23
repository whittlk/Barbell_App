package com.example.barbellapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LegendCreateAccount extends AppCompatActivity {

    EditText fName;
    EditText lName;
    EditText email;
    EditText pass;
    EditText confirmPass;
    Button register;
    ProgressBar progressBar;
    String p;
    String cP;
    boolean matches;
    private static final String TAG = "LegendCreateAccount";

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_create_account);


        fName = findViewById(R.id.first_name_input);
        lName = findViewById(R.id.last_name_input);
        email = findViewById(R.id.r_email_address_input);
        pass = findViewById(R.id.r_password_input);
        confirmPass = findViewById(R.id.re_enter_password_input);
        register = findViewById(R.id.submit);
        progressBar = findViewById(R.id.r_progressBar);
        p = pass.getText().toString();
        cP = confirmPass.getText().toString();


        firebaseAuth = firebaseAuth.getInstance();

        //TODO
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Create a string for P and CP
                // P: password
                // cp: Compare password
                if (!p.equals(cP)) {
                    Toast.makeText(LegendCreateAccount.this, "Passwords Do Not Match",
                            Toast.LENGTH_LONG).show();
                }
                //Register user in fire base
                //Change
                else {
                    progressBar.setVisibility(View.VISIBLE);
                    firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(),
                            pass.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {
                                        Toast.makeText(LegendCreateAccount.this, "Registered Successfully",
                                                Toast.LENGTH_LONG).show();
                                        startActivity(new Intent(LegendCreateAccount.this, LoginActivity.class));
                                        Log.i("SignupActivity", "Sign Up Successful");
                                    } else {
                                        Toast.makeText(LegendCreateAccount.this, task.getException().getMessage(),
                                                Toast.LENGTH_LONG).show();
                                        Log.e("SignupActivity", "Sign Up Failed");
                                    }
                                }

                            });
                }
            }
        });
    }
}
