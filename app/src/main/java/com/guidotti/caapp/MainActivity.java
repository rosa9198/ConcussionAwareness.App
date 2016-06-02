package com.guidotti.caapp;

/**
 * Shared on GitHub on ConcussionAwareness.App repository
 */


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Color;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    public AppCompatActivity that = this;

    private RelativeLayout layout;
    private Button rand, sleepbutton, ratebutton, calbutton;
    public SleepHygiene sleep;
    public Calendar cal;
    public Rating rating;
    public Context context;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (RelativeLayout) findViewById(R.id.layout);
        layout.setBackgroundColor(Color.rgb(34, 139, 34));
        final AppCompatActivity that = this;

        rand = (Button) findViewById(R.id.nextbutton);
        layout.removeView(findViewById(R.id.word));
        layout.removeView(findViewById(R.id.textView));
        rand.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Word word = new Word(that);
                Intent myIntent = new Intent(MainActivity.this, Word.class);
                MainActivity.this.startActivity(myIntent);

            }
        });



        //sleep button
        sleepbutton = (Button) findViewById(R.id.sleepbutton);
        sleepbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                layout.removeView(findViewById(R.id.layout));
                sleep = new SleepHygiene();
                Intent myIntent1 = new Intent(MainActivity.this, SleepHygiene.class);
                MainActivity.this.startActivity(myIntent1);


            }
        });
        //rating button
        ratebutton = (Button) findViewById(R.id.Rating);
        ratebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layout.removeView(findViewById(R.id.layout));
                rating = new Rating();
                Intent myIntent2 = new Intent(MainActivity.this, Rating.class);
                MainActivity.this.startActivity(myIntent2);
            }
        });

        //calendar button
        calbutton = (Button) findViewById(R.id.calbutton);
        calbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layout.removeView(findViewById(R.id.layout));
                cal = new Calendar();
                Intent myIntent3 = new Intent(MainActivity.this, Calendar.class);
                MainActivity.this.startActivity(myIntent3);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void setLayout(View x) {
        Word word = new Word(that);
        layout.addView(x);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}