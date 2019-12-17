package com.example.HungryPanda;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class sound {
    private static SoundPool sp;
    private static int click;
    private static int death;
    private static int bgm;

    public sound(Context context){
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        click = sp.load(context, R.raw.click, 1);
        death = sp.load(context, R.raw.death, 1);
        bgm = sp.load(context, R.raw.bgs, 1);
    }
    public void playclick(){
        sp.play(click, 1.0f,1.0f,1,0,1.0f);
    }
    public void playdeath(){
        sp.play(click, 1.0f,1.0f,1,0,1.0f);
    }
    public void playbgm(){
        sp.play(click, 1.0f,1.0f,1,0,1.0f);
    }
}
