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
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassActivity extends AppCompatActivity {

    ProgressBar prProgressBar;
    EditText email;
    Button reset;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        prProgressBar = findViewById(R.id.pr_progress_bar);
        email = findViewById(R.id.pr_email_address_input);
        reset = findViewById(R.id.pr_reset_button);

        firebaseAuth = FirebaseAuth.getInstance();

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                prProgressBar.setVisibility(View.VISIBLE);
                firebaseAuth.sendPasswordResetEmail(email.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                prProgressBar.setVisibility(View.GONE);
                                if(task.isSuccessful()){
                                    Toast.makeText(ForgotPassActivity.this,
                                            "Password Reset Email Sent",
                                            Toast.LENGTH_LONG).show();
                                    startActivity(new Intent(ForgotPassActivity.this, LegendsMain.class));
                                }else{
                                    Toast.makeText(ForgotPassActivity.this,
                                            task.getException().getMessage(),
                                            Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });
    }
}
