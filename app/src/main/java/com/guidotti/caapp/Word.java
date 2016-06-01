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
    public static String[] wordlist = {"Calendar", "Specialists to go see: ", "Prevention", "What to do:", "Sleep"}; //"Comments:",
    public static String[] tiplist = {"1. Get on a schedule. Go to bed and get up at about the same time every day. \n\n",
            "2.    Listen to your body. \n\n",
            "3.    Be patient. If you haven’t been able to get to sleep after about 20 minutes or more, get up and do something calming or boring until you feel sleepy and try again. \n\n",
            "4.    Avoid caffeine for at least 4-6 hours before going to bed. Also suggested that you don’t use alcohol or nicotine during this time.  \nBoth can make it harder for you to fall asleep and stay asleep.  (Caffeine: coffee, tea, cola drinks, chocolate, and some medicines)",
            "5.    Use your bed for sleeping only. (But during this phase try to relax as much as possible) \n\n",
            "6.    Try not to nap during the day after the first two weeks. If you do try only for about an hour and before 3pm. \n\n",
            "7.    Create sleep rituals that remind your body that it is time to sleep. (breathing exercises, stretching, or reading a book). \n\n",
            "8.    Try a bath or shower before bed. Having a hot bath 1 to 2 hours before bedtime can help you feel sleepy. \n\n",
            "9.    Don’t watch the clock. Checking the clock during the night can wake you up. It can also lead to negative thoughts such as “I will never fall asleep” \n\n",
            "10. Use a sleep diary. Track your sleep schedule to know your sleep patterns and to see where you can improve. \n\n",
            "11. Get regular exercise but try not to do anything to heavy especially before bed. \n\n",
            "12. Eat a healthy, balanced diet. Try eating a light, healthy snack before bed but avoid eating a heavy meal. \n\n",
            "13. Create the right sleeping area. A cool, dark, quiet room is best. If needed try earplugs, fans and blackout curtains. \n\n",
            "14. Keep your daytime routine the same even if you have a bad night sleep. Avoiding activities the next day can make it harder to sleep. \n\n"};


    public static int lastword=20;



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
        int r = (int) (Math.random() * wordlist.length);
        int t = 1;
        while(r!=lastword) {

            System.out.println(wordlist[r]);
            if (wordlist[r].equals("Calendar")) {

                System.out.println("Calendar" + r);
            } else if (wordlist[r].equals("Specialists to go see: ")) {
                setText(wordlist[r]);
                System.out.println("Specialists: " + r);
            } else if (wordlist[r].equals("Prevention")) {
                System.out.println("Prevention");
                setText(wordlist[r]);
            } else if (wordlist[r].equals("What to do:")) {
                System.out.println("What to do:");
                setText(wordlist[r]);
            }//else if(wordlist[r].equals("Comments:")){
            // System.out.println("Comments:");
            //    }
            else if (wordlist[r].equals("Sleep")) {
                while (t != lastword) {
                    t = (int) (Math.random() * wordlist.length);
                }
                setText("Sleep Tips: \n" + tiplist[t]);
                System.out.println("Sleep. r = " + r + "t=" + t);
            }
            else{
                setText("Blank Page");
            }

            lastword = r;
        }
    }
    protected void onLayout(boolean changed, int l, int t, int r, int b)
    {

    }


}
