package com.example.convertorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);
            Button converters = (Button) findViewById(R.id.convert2);
            converters.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    TextView bin = (TextView) findViewById(R.id.binary);
                    TextView octal = (TextView) findViewById(R.id.octal2);
                    TextView hx = (TextView) findViewById(R.id.hexadecimal2);


                    EditText bins = (EditText) findViewById(R.id.inputedittext2);
                    String decimal = bins.getText().toString();


                    if (!decimal.equals("")) {

                        try {
                            long d = Long.parseLong(decimal);
                            String b = Long.toBinaryString(d);
                            bin.setText("Decimal:" + b);

                        } catch (Exception e) {
                            bin.setText("OOPs!!");
                        }
                        try {
                            long d = Long.parseLong(decimal);
                            String oct = Long.toOctalString(d);
                            octal.setText("Octal:" + oct);

                        } catch (Exception e) {

                            octal.setText("Limit");
                        }
                        try {
                            long d = Long.parseLong(decimal);
                            String hex = Long.toHexString(d);
                            hx.setText("Hexadecimal: " + hex);

                        } catch (Exception e) {
                            hx.setText("Exceeded!!");
                        }

                    }



                }});

    }
}


