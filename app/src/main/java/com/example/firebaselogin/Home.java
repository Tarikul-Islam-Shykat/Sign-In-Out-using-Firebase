package com.example.firebaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

    Button logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logOut = findViewById(R.id.home_btn_logOut);

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // it will automatically  sign you Out from firebase
                FirebaseAuth.getInstance().signOut();

                Toast.makeText(Home.this, "logged Out", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(Home.this, MainActivity.class));

                // if you press the back button it will take you out from the log out page
                // and distroy the app
                finish();
            }
        });
    }



}