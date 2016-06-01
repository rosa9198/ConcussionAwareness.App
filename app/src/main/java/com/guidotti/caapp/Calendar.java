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

public class Calendar extends AppCompatActivity {

    public AppCompatActivity that = this;
    private GoogleApiClient client;
    public Button save;
    public TextView date, time, activity, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

       save = (Button)findViewById(R.id.saveButton);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Save Date, Time, Activity, Address into a graph/table, and have another tab to go to to view this data
                date = (TextView) findViewById(R.id.editDate);
                time = (TextView) findViewById(R.id.editTime);
                activity = (TextView) findViewById(R.id.editAct);
                address = (TextView) findViewById(R.id.editAddress);

                //To test out the textviews and see how they will show. Might have another activity with a list/table with this info
                System.out.println("You have " + activity + " on " + date + " at " + time + " at " + address);
            }

        });
    }
}
