package com.example.convertorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BinaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);

        Button convert=(Button) findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView deci = (TextView) findViewById(R.id.decimal);
                TextView octal = (TextView) findViewById(R.id.octal);
                TextView hx=(TextView)findViewById(R.id.hexadecimal);
                try {
                    EditText bin = (EditText) findViewById(R.id.inputedittext);
                    String binary = bin.getText().toString();


                    if (!binary.equals("")) {

                        try {
                            long dec = Long.parseLong(binary, 2);
                            deci.setText("Decimal:" + String.valueOf(dec));

                        } catch (Exception e) {
                            deci.setText("Limit exceeded!!");
                        }
                        try {
                            long oct = Long.parseLong(binary, 8);
                            octal.setText("Octal:" + String.valueOf(oct));

                        } catch (Exception e) {

                            octal.setText("Limit exceeded!!");
                        }
                        try {
                            long bnum = Long.parseLong(binary);
                            String hex = Long.toHexString(bnum);
                            hx.setText("Hexadecimal: " + hex);

                        } catch (Exception e) {
                            hx.setText("Limit exceeded!!");
                        }

                    }
                }
                catch(Exception e)
                {
                    deci.setText("OOPS!");
                    octal.setText("Limit");
                    hx.setText("Exceeded!");

                }



                }
            });
    }
}


