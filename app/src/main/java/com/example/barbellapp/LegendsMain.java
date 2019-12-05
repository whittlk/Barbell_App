package com.example.barbellapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LegendsMain extends AppCompatActivity {

    ProgressBar lProgressBar;
    EditText lUser;
    EditText lPass;
    Button lLogin;
    TextView createAccount;
    TextView forgotPass;
    private static final String TAG = "LegendsMain";

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legends_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        lProgressBar = findViewById(R.id.login_progress_bar);
        lUser = findViewById(R.id.email_address_input);
        lPass = findViewById(R.id.password_input);
        lLogin = findViewById(R.id.login_button);
        createAccount = findViewById(R.id.create_account);
        forgotPass = findViewById(R.id.forgot_password);



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
                                    startActivity(new Intent(LegendsMain.this, LegendsHome.class));
                                    Log.i("LegendsMain", "Login Successful" );
                                }else{
                                    Toast.makeText(LegendsMain.this, task.getException().getMessage(),
                                            Toast.LENGTH_LONG).show();
                                    Log.e("LegendsMain", "Login Failed" );
                                }
                            }
                        });
            }
        });

        forgotPass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendsMain.this, ForgotPassActivity.class));
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendsMain.this, LegendCreateAccount.class));
            }
        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    return false;
                }
            };
}
