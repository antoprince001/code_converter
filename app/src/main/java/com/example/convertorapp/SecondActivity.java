package com.example.convertorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SecondActivity extends AppCompatActivity {

    private RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        rg = (RadioGroup) findViewById(R.id.rgroup);
        Button input = (Button) findViewById(R.id.button2);

        input.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         int selected = rg.getCheckedRadioButtonId();
                                         Intent StartIntent;
                                         switch (selected) {
                                             case R.id.Binary:
                                                 StartIntent = new Intent(getApplicationContext(), BinaryActivity.class);
                                                 startActivity(StartIntent);
                                                 break;
                                             case R.id.Decimal:
                                                 StartIntent = new Intent(getApplicationContext(), DecimalActivity.class);
                                                 startActivity(StartIntent);
                                                 break;

                                             case R.id.HexaDecimal:
                                                 StartIntent = new Intent(getApplicationContext(), HexaDecimalActivity.class);
                                                 startActivity(StartIntent);
                                                 break;

                                             case R.id.Text:
                                                 StartIntent = new Intent(getApplicationContext(), TextActivity.class);
                                                 startActivity(StartIntent);
                                                 break;

                                             case R.id.Morse:
                                                 StartIntent = new Intent(getApplicationContext(), MorseActivity.class);
                                                 startActivity(StartIntent);
                                                 break;

                                             case R.id.Octal:
                                                 StartIntent = new Intent(getApplicationContext(), OctalActivity.class);
                                                 startActivity(StartIntent);
                                                 break;

                                             default:
                                                 //StartIntent = new Intent(getApplicationContext(), MainActivity.class);
                                                 //startActivity(StartIntent);
                                                 break;
                                         }
                                     }


                                 }
        );

    }
}





