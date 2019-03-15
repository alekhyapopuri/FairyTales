package com.nrtec.alekhya.fairytales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        b1=findViewById(R.id.text1);
        b2=findViewById(R.id.text2);
        b3=findViewById(R.id.text3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void textone(View view) {
        Intent i=new Intent(getApplicationContext(),SecondActivity.class);
        i.putExtra("textone",getString(R.string.onetext));
        startActivity(i);

    }

    public void texttwo(View view) {
        Intent i=new Intent(getApplicationContext(),SecondActivity.class);
        i.putExtra("texttwo",getString(R.string.twotext));
        startActivity(i);
    }

    public void textthree(View view) {
        Intent i=new Intent(getApplicationContext(),SecondActivity.class);
        i.putExtra("textthree",getString(R.string.thirdtext));
        startActivity(i);
    }
}
