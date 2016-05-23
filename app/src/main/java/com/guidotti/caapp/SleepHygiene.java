package com.guidotti.caapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SleepHygiene extends TextView {

    public static String[] intro ={"Follow tips below to sleep better at night: "};
    public static String[] tiplist = {"1. Get on a schedule. Go to bed and get up at about the same time every day. ",
            "2.    Listen to your body. ",
            "3.    Be patient. If you haven’t been able to get to sleep after about 20 minutes or more, get up and do something calming or boring until you feel sleepy and try again.",
            "4.    Avoid caffeine for at least 4-6 hours before going to bed. Also suggested that you don’t use alcohol or nicotine during this time.  Both can make it harder for you to fall asleep and stay asleep.  (Caffeine: coffee, tea, cola drinks, chocolate, and some medicines)",
            "5.    Use your bed for sleeping only. (But during this phase try to relax as much as possible) ",
            "6.    Try not to nap during the day after the first two weeks. If you do try only for about an hour and before 3pm.",
            "7.    Create sleep rituals that remind your body that it is time to sleep. (breathing exercises, stretching, or reading a book) ",
            "8.    Try a bath or shower before bed. Having a hot bath 1 to 2 hours before bedtime can help you feel sleepy. ",
            "9.    Don’t watch the clock. Checking the clock during the night can wake you up. It can also lead to negative thoughts such as “I will never fall asleep” ",
            "10. Use a sleep diary. Track your sleep schedule to know your sleep patterns and to see where you can improve. ",
            "11. Get regular exercise but try not to do anything to heavy especially before bed. ",
            "12. Eat a healthy, balanced diet. Try eating a light, healthy snack before bed but avoid eating a heavy meal. ",
            "13. Create the right sleeping area. A cool, dark, quiet room is best. If needed try earplugs, fans and blackout curtains. ",
            "14. Keep your daytime routine the same even if you have a bad night sleep. Avoiding activities the next day can make it harder to sleep. "};

    public static int lastword;

    public SleepHygiene(Context context){
        super(context);
        init(context);
    }

    public SleepHygiene(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context){
        setId(R.id.sleep);
        setTextSize(18);
        setText(intro[0]);

        int r = lastword;


        while(r==lastword) {
            r = (int) (Math.random() * tiplist.length);
        }

        setText(tiplist[r]);
        lastword = r;

    }
    protected void onLayout(boolean changed, int l, int t, int r, int b)
    {

    }



}

