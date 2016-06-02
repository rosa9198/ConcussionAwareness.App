package com.guidotti.caapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SleepHygiene extends AppCompatActivity {

    public int r=0;
    public int lastword;
    public LinearLayout layout;
    public Button random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_hygiene);

        random = (Button) findViewById(R.id.RandTip);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lastword = r;
                while(r==lastword){
                    r=(int)(Math.random()*14);
                }

                lastword=r;
            }
        });



    }

}
