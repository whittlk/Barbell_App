package com.example.barbellapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {

    ProgressBar progressBar;
    EditText email;
    EditText password;
    Button signup;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        progressBar = findViewById(R.id.sProgressBar);
        email = findViewById(R.id.etSEmail);
        password = findViewById(R.id.etSPass);
        signup = findViewById(R.id.btnSSignUp);

        firebaseAuth = FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(),
                        password.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if(task.isSuccessful()){
                                    Toast.makeText(SignupActivity.this, "Registered Successfully",
                                            Toast.LENGTH_LONG).show();
                                    startActivity(new Intent(SignupActivity.this, LoginActivity.class));
                                }else{
                                    Toast.makeText(SignupActivity.this, task.getException().getMessage(),
                                            Toast.LENGTH_LONG).show();
                                }
                            }

                        });
            }
        });
    }
}
