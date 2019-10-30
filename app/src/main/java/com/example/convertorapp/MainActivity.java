package com.example.convertorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/* Main page from where the converting options appear after passing it throug*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent StartIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(StartIntent);

            }
        });

    }
}
