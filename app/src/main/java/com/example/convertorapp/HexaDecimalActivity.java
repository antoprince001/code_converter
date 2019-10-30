package com.example.convertorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HexaDecimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexa_decimal);
        Button c=(Button)findViewById(R.id.convert3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText o=(EditText)findViewById(R.id.inputedittext3) ;
                String hx=o.getText().toString();

                TextView dec=findViewById(R.id.decimal2);
                TextView bin=findViewById(R.id.binary3);
                TextView oct=findViewById(R.id.octal3);

                try
                {
                    long decimal=0;
                    int base=1,len=hx.length();
                    for(int i=len-1;i>=0;i--)
                    {
                        if(hx.charAt(i)>='0' && hx.charAt(i)<='9')
                        {
                            decimal+=(hx.charAt(i)-48)*base;
                        }
                        else  if(hx.charAt(i)>='A' && hx.charAt(i)<='F')
                        {
                            decimal+=(hx.charAt(i)-55)*base;
                        }
                        else  if(hx.charAt(i)>='a' && hx.charAt(i)<='f')
                        {
                            decimal+=(hx.charAt(i)-87)*base;
                        }

                    }
                    String bins=Long.toBinaryString(decimal);
                    String octl=Long.toOctalString(decimal);

                    dec.setText("Decimal: "+String.valueOf(decimal));
                    bin.setText("Binary: "+bins);
                    oct.setText("Octal: "+octl);
                }catch (Exception e)
                {
                    dec.setText("OOPs");
                    oct.setText("Limit");
                    bin.setText("Exceeded!");
                }
    }
});
    }
}
