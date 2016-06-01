package com.guidotti.caapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Rating extends AppCompatActivity {

    public AppCompatActivity that = this;
    private CheckBox b0, b1, b2, b3, b4, b5, b6;
    public int rate = 0;
    public Button save;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        b0 = (CheckBox) findViewById(R.id.Rate0);
        b1 = (CheckBox) findViewById(R.id.Rate1);
        b2 = (CheckBox) findViewById(R.id.Rate2);
        b3 = (CheckBox) findViewById(R.id.Rate3);
        b4 = (CheckBox) findViewById(R.id.Rate4);
        b5 = (CheckBox) findViewById(R.id.Rate5);
        b6 = (CheckBox) findViewById(R.id.Rate6);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b0.isChecked()) {
                    rate = 0;
                } else if (b1.isChecked()) {
                    rate = 1;
                } else if (b2.isChecked()) {
                    rate = 2;
                } else if (b3.isChecked()) {
                    rate = 3;
                } else if (b4.isChecked()) {
                    rate = 4;
                } else if (b5.isChecked()) {
                    rate = 5;
                } else if (b6.isChecked()) {
                    rate = 6;
                }
            }
        });

        save = (Button) findViewById(R.id.saveButton);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Calendar cal = new Calendar();
            Intent myIntent = new Intent(Rating.this, Calendar.class);
            Rating.this.startActivity(myIntent);
            }


        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

}
