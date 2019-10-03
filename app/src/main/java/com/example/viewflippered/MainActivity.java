package com.example.viewflippered;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = findViewById(R.id.viewflipper);
        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        TextView textView = new TextView(this);
        textView.setText("this is thirsd ");//this is dynamically generated textview
        viewFlipper.addView(textView); // we put all views inside viewflipper which views we want to show,except both buttons
        button1.setOnClickListener(new View.OnClickListener() { //click event on previous button
            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // click event on next button
            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
      //  viewFlipper.setFlipInterval(3000);//if we want auto start of view flipper,time is in milli second
       // viewFlipper.setAutoStart(true);
    }
}


