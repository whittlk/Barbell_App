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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.HashMap;
import java.util.Map;

public class LegendCreateAccount extends AppCompatActivity {

    private static final String TAG = "LegendCreateAccount";
    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabaseReference = mDatabase.getReference();
    EditText fName, lName, email;
    Button register;
    ProgressBar progressBar;
    FirebaseAuth firebaseAuth;
    private DatabaseReference db;
    Map<String, Object> user = new HashMap<>();
    String firstName, lastName, sEmail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_create_account);

        db = FirebaseDatabase.getInstance().getReference();


        fName = findViewById(R.id.first_name_input);
        lName = findViewById(R.id.last_name_input);
        email = findViewById(R.id.r_email_address_input);
        final EditText pass = findViewById(R.id.r_password_input);
        final EditText confirmPass = findViewById(R.id.re_enter_password_input);

        firstName = fName.getText().toString();
        lastName = lName.getText().toString();
        sEmail = email.getText().toString();

        register = findViewById(R.id.submit);
        progressBar = findViewById(R.id.r_progressBar);

        firebaseAuth = FirebaseAuth.getInstance();

        //TODO
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = pass.getText().toString();
                String Cpassword = confirmPass.getText().toString();
                if (!password.equals(Cpassword)) {
                    Toast.makeText(getApplicationContext(), "Passwords Do Not Match",
                            Toast.LENGTH_LONG).show();
                } else {
                    progressBar.setVisibility(View.VISIBLE);
                    firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(),
                            pass.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {
                                        Log.i("LegendCreateAccount", "Test 1");
                                        String currentUserUid = FirebaseAuth.getInstance().getCurrentUser().getUid();
                                        User user = new User(fName.getText().toString(), lName.getText().toString(), email.getText().toString(), "false");
                                        mDatabaseReference = mDatabase.getReference().child("users").child(currentUserUid);
                                        mDatabaseReference.setValue(user);
                                        //mDatabaseReference = mDatabase.getReference().child("users");
                                        Log.i("LegendCreateAccount", "Test 2");
                                        //mDatabaseReference.setValue("test2");
                                        startActivity(new Intent(LegendCreateAccount.this, LegendsMain.class));
                                        Log.i("LegendCreateAccount", "Sign Up Successful");
                                    } else {
                                        Toast.makeText(LegendCreateAccount.this, task.getException().getMessage(),
                                                Toast.LENGTH_LONG).show();
                                        Log.e("LegendCreateAccount", "Sign Up Failed");
                                    }
                                }

                            });
                }//End of on create
            }
        });
    }
}