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
    public static String[] wordlist = {"Calendar", "Specialists to go see: ", "Prevention", "What to do:", "Comments:"};

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
        if(wordlist[r].equals("Calendar")){
            System.out.println("Calendar");
        }else if(wordlist[r].equals("Specialists to go see: ")){
            System.out.println("Specialists: ");
        }else if(wordlist[r].equals("Prevention")){
            System.out.println("Prevention");
        }else if(wordlist[r].equals("What to do:")){
            System.out.println("What to do:");
        }else if(wordlist[r].equals("Comments:")){
            System.out.println("Comments:");
        }


        setText(wordlist[r]);
        lastword = r;

    }
    protected void onLayout(boolean changed, int l, int t, int r, int b)
    {

    }


}
