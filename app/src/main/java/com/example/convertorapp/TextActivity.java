package com.example.convertorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);


        Button b=(Button)findViewById(R.id.convert4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText s=(EditText)findViewById(R.id.text2);
                String text=s.getText().toString();
                TextView up=(TextView)findViewById(R.id.up);
                TextView low=(TextView)findViewById(R.id.low);
                TextView mor=(TextView)findViewById(R.id.morse2);
              try
              {
                  up.setText("UpperCase: "+text.toUpperCase());
                  low.setText("LowerCase: "+text.toLowerCase());
                  StringBuilder morse=new StringBuilder("");
                  for(int i=0;i<text.length();i++)
                  {
                      switch(text.charAt(i))
                      {
                          case 'a':
                              morse.append(".-");
                              break;
                          case 'b':
                              morse.append("-...");
                              break;

                          case 'c':
                              morse.append("-.-.");
                              break;

                          case 'd':
                              morse.append("-..");
                              break;

                          case 'e':
                              morse.append(".");
                              break;

                          case 'f':
                              morse.append("..-.");
                              break;

                          case 'g':
                              morse.append("--.");
                              break;

                          case 'h':
                              morse.append("....");
                              break;

                          case 'i':
                              morse.append("..");
                              break;

                          case 'j':
                              morse.append(".---");
                              break;

                          case 'k':
                              morse.append("-.-");
                              break;

                          case 'l':
                              morse.append(".-..");
                              break;

                          case 'm':
                              morse.append("--");
                              break;

                          case 'n':
                              morse.append("-.");
                              break;

                          case 'o':
                              morse.append("---");
                              break;

                          case 'p':
                              morse.append(".--.");
                              break;

                          case 'q':
                              morse.append("--.-");
                              break;

                          case 'r':
                              morse.append(".-.");
                              break;

                          case 's':
                              morse.append("...");
                              break;

                          case 't':
                              morse.append("-");
                              break;

                          case 'u':
                              morse.append("..-");
                              break;

                          case 'v':
                              morse.append("...-");
                              break;

                          case 'w':
                              morse.append(".--");
                              break;

                          case 'x':
                              morse.append("-..-");
                              break;

                          case 'y':
                              morse.append("-.--");
                              break;

                          case 'z':
                              morse.append("--..");
                              break;

                          case '1':
                              morse.append(".----");
                              break;
                          case '2':
                              morse.append("..---");
                              break;

                          case '3':
                              morse.append("...--");
                              break;

                          case '4':
                              morse.append("....-");
                              break;

                          case '5':
                              morse.append(".....");
                              break;

                          case '6':
                              morse.append("-....");
                              break;

                          case '7':
                              morse.append("--...");
                              break;

                          case '8':
                              morse.append("---..");
                              break;

                          case '9':
                              morse.append("----.");
                              break;

                          case '0':
                              morse.append("-----");
                              break;
                          case ' ':
                              morse.append("  ");
                              break;

                          default:
                              morse.append(" ");
                              break;


                      }

                  }
                  mor.setText("Morse: "+morse);

              }catch(Exception e)
              {
                  mor.setText("Sorry!");
                  up.setText("Try");
                  low.setText("Again!");
              }
            }
        });
    }
}
