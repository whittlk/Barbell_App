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

/**
 * LegendsMain is used for having users login. They will enter their username
 * and password that is stored in firebase. Once that is authenticated, they
 * will be redirected to their home page.
 *
 * New users can click on the link at the bottom to create an account in
 * firebase. This will redirect them to the create account page and store
 * their information in firebase.
 */

public class LegendsMain extends AppCompatActivity {

    ProgressBar lProgressBar;
    EditText lUser;
    EditText lPass;
    Button lLogin;
    TextView createAccount;
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
