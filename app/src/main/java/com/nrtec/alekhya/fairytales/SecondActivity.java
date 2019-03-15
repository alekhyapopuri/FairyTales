package com.nrtec.alekhya.fairytales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.text);
        Intent i=getIntent();
        if(i.hasExtra("textone")){
            tv.setText(i.getStringExtra("textone"));
        }
        else if(i.hasExtra("texttwo")){
            tv.setText(i.getStringExtra("texttwo"));}
            else{
                tv.setText(i.getStringExtra("textthree"));
            }



        }
    }

