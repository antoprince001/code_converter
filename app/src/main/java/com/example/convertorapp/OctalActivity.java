package com.example.convertorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OctalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octal);

        Button c=(Button)findViewById(R.id.convert5);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText o=(EditText)findViewById(R.id.inputedittext5) ;
                String oct=o.getText().toString();

                TextView dec=findViewById(R.id.decimal5);
                TextView bin=findViewById(R.id.binary5);
                TextView hx=findViewById(R.id.hx5);

                try
                {
                 long decimal=Long.parseLong(oct,8);
                 String bins=Long.toBinaryString(decimal);
                 String hexa=Long.toHexString(decimal);

                 dec.setText("Decimal: "+String.valueOf(decimal));
                 bin.setText("Binary: "+bins);
                 hx.setText("Hexadecimal: "+hexa);
                }catch (Exception e)
                {
                    dec.setText("OOPs");
                    bin.setText("Limit");
                    hx.setText("Exceeded!");
                }
            }
        });
    }
}
