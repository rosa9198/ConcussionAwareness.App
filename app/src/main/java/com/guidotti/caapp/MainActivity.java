package com.guidotti.caapp;

/**
 * Shared on GitHub on ConcussionAwareness.App repository
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Color;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  final AppCompatActivity that = this;

    private RelativeLayout layout;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (RelativeLayout) findViewById(R.id.layout);
        button = (Button) findViewById(R.id.prevbutton);
        button = (Button) findViewById(R.id.nextbutton);

        layout.setBackgroundColor(Color.rgb(34, 139, 34));

        //Word intro = new Word();
        //layout.addView();

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                layout.removeView(findViewById(R.id.word));
                Word word = new Word(that);
                layout.addView(word);
                //layout.setBackgroundColor(Color.rgb((int) 34, 139, 34));
                //Girl Scout Green???
            }
        });
    }

    public void setLayout(View x){
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
