package com.example.homeserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        if (getSupportActionBar()!=null)
        {
            getSupportActionBar().hide();
        }

        Intent i = new Intent(LogIn.this,SignUp.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
            }
        },5000);
    }
}