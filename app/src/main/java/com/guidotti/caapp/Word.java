package com.guidotti.caapp;

/**
 * Word will be what I put on the screen of the app
 */


import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;

public class Word extends TextView{
    public static String[] wordlist = {"word 1", "word 2", "word 3"};

    public static int lastword;

    public Word(Context context){
        super(context);
        init(context);
    }

    public Word(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context){
        setId(R.id.word);
        setTextSize(18);

        int r = lastword;
        
        while(r==lastword){
            r = (int)(Math.random()*wordlist.length);
        }
        setText(wordlist[r]);
        lastword = r;

    }
    protected void onLayout(boolean changed, int l, int t, int r, int b)
    {

    }


}
