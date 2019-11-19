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
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    ProgressBar lProgressBar;
    EditText lUser;
    EditText lPass;
    Button lLogin;
    private static final String TAG = "LoginActivity";

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lProgressBar = findViewById(R.id.loProgressBar);
        lUser = findViewById(R.id.etLoEmail);
        lPass = findViewById(R.id.etLoPass);
        lLogin = findViewById(R.id.btnLoLogin);

        firebaseAuth = FirebaseAuth.getInstance();

        lLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lProgressBar.setVisibility(View.VISIBLE);
                firebaseAuth.signInWithEmailAndPassword(lUser.getText().toString(),
                        lPass.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        lProgressBar.setVisibility(View.GONE);
                        if(task.isSuccessful()){
                            startActivity(new Intent(LoginActivity.this, ProfileActivity.class));
                            Log.i("LoginActivity", "Login Successful" );
                        }else{
                            Toast.makeText(LoginActivity.this, task.getException().getMessage(),
                                    Toast.LENGTH_LONG).show();
                            Log.e("LoginActivity", "Login Failed" );
                        }
                    }
                });
            }
        });
    }
}
