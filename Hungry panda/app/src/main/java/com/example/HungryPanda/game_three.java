package com.example.HungryPanda;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class game_three extends AppCompatActivity {

    TextView countdown;
    //private CountDownTimer countDownTimer;
    //int timeleft=3000   ;
    public int counter;
    ImageView imageView2,imageView3;
    Button start, reset, back;
    boolean win1= true;
    boolean win2= true;
    int winone=20;
    int wintwo=20;
    boolean start_game=false;
    private sound so;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_three);
        so= new sound(this);
        start=findViewById(R.id.button);
        reset=findViewById(R.id.reset);
        back=findViewById(R.id.button1);
        countdown=findViewById(R.id.countdown);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);


        // start.setVisibility(View.INVISIBLE);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
               /* Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "0", Toast.LENGTH_SHORT).show();*/

                /*imageView2.setImageResource(R.drawable.boxing_panda1);
                imageView3.setImageResource(R.drawable.boxing_panda2);*/
                new CountDownTimer(4000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        countdown.setText(""+ millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        start.setVisibility(View.INVISIBLE);
                        countdown.setText("");

                    }
                }.start();
                start_game=true;
            }

        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                Intent re=new Intent(game_three.this, game_three.class);
                startActivity(re);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                Intent re=new Intent(game_three.this, playActivity.class);
                startActivity(re);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(start_game==true && win1!=false) {

                    imageView2.setImageResource(R.drawable.boxing_panda1);
                    winone--;
                    if(winone<1) {
                        imageView3.setImageResource(R.drawable.fall2);
                        Toast.makeText(game_three.this, "Panda A win", Toast.LENGTH_SHORT).show();
                        win1 = true;
                        win2 = false;
                        so.playdeath();
                    }
                }


            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(start_game==true && win2!=false) {
                    imageView3.setImageResource(R.drawable.boxing_panda2);
                    wintwo--;
                    if(wintwo<1) {
                        imageView2.setImageResource(R.drawable.fall1);
                        Toast.makeText(game_three.this, "Panda B win", Toast.LENGTH_SHORT).show();
                        win2 = true;
                        win1 = false;
                        so.playdeath();
                    }
                }

            }
        });
    }
}

