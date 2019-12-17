package com.example.HungryPanda;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class game_two extends AppCompatActivity {
    private sound so;
    Button reset, exit;
    TextView tv_p1, tv_p2;
    ImageView q11,q12,q13,q14,q21,q22,q23,q24,q31,q32,q33,q34,q41,q42,q43,q44;
    Integer[] cardArray = {101, 102, 103, 104, 105, 106, 107,108, 201, 202, 203, 204, 205, 206, 207, 208};

    int i101,i102,i103,i104,i105,i106,i107,i108,i201, i202, i203, i204, i205, i206, i207, i208;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumbr =1;

    int turn=1;
    int player1Points=0, player2Points=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_two);
        so= new sound(this);
        reset=(Button) findViewById(R.id.reset);
        exit=(Button) findViewById(R.id.exit);
        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);
        q11 = (ImageView) findViewById(R.id.q11);
        q12 = (ImageView) findViewById(R.id.q12);
        q13 = (ImageView) findViewById(R.id.q13);
        q14 = (ImageView) findViewById(R.id.q14);
        q21 = (ImageView) findViewById(R.id.q21);
        q22 = (ImageView) findViewById(R.id.q22);
        q23 = (ImageView) findViewById(R.id.q23);
        q24 = (ImageView) findViewById(R.id.q24);
        q31 = (ImageView) findViewById(R.id.q31);
        q32 = (ImageView) findViewById(R.id.q32);
        q33 = (ImageView) findViewById(R.id.q33);
        q34 = (ImageView) findViewById(R.id.q34);
        q41 = (ImageView) findViewById(R.id.q41);
        q42 = (ImageView) findViewById(R.id.q42);
        q43 = (ImageView) findViewById(R.id.q43);
        q44 = (ImageView) findViewById(R.id.q44);

        q11.setTag("0");
        q12.setTag("1");
        q13.setTag("2");
        q14.setTag("3");
        q21.setTag("4");
        q22.setTag("5");
        q23.setTag("6");
        q24.setTag("7");
        q31.setTag("8");
        q32.setTag("9");
        q33.setTag("10");
        q34.setTag("11");
        q41.setTag("12");
        q42.setTag("13");
        q43.setTag("14");
        q44.setTag("15");

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                Intent re=new Intent(game_two.this, game_two.class);
                startActivity(re);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                Intent ex=new Intent(game_two.this, playActivity.class);
                startActivity(ex);
                finish();
            }
        });
        frontOfCardResources();
        Collections.shuffle(Arrays.asList(cardArray));
        tv_p2.setTextColor(Color.GRAY);

        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q11, theCard);
            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q12, theCard);

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q13, theCard);

            }
        });
        q14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q14, theCard);

            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q21, theCard);

            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q22, theCard);

            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q23, theCard);

            }
        });
        q24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q24, theCard);

            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q31, theCard);

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q32, theCard);

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q33, theCard);

            }
        });
        q34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q34, theCard);

            }
        });
        q41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q41, theCard);

            }
        });
        q42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q42, theCard);

            }
        });
        q43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q43, theCard);

            }
        });
        q44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(q44, theCard);

            }
        });

    }
    private void doStuff(ImageView iv, int card) {

        if (cardArray[card] == 101) {
            iv.setImageResource((i101));
        } else if (cardArray[card] == 102) {
            iv.setImageResource((i102));
        } else if (cardArray[card] == 103) {
            iv.setImageResource((i103));
        } else if (cardArray[card] == 104) {
            iv.setImageResource((i104));
        } else if (cardArray[card] == 105) {
            iv.setImageResource((i105));
        } else if (cardArray[card] == 106) {
            iv.setImageResource((i106));
        } else if (cardArray[card] == 107) {
            iv.setImageResource((i107));
        } else if (cardArray[card] == 108) {
            iv.setImageResource((i108));
        } else if (cardArray[card] == 201) {
            iv.setImageResource((i201));
        } else if (cardArray[card] == 202) {
            iv.setImageResource((i202));
        } else if (cardArray[card] == 203) {
            iv.setImageResource((i203));
        } else if (cardArray[card] == 204) {
            iv.setImageResource((i204));
        } else if (cardArray[card] == 205) {
            iv.setImageResource((i205));
        } else if (cardArray[card] == 206) {
            iv.setImageResource((i206));
        } else if (cardArray[card] == 207) {
            iv.setImageResource((i207));
        } else if (cardArray[card] == 208) {
            iv.setImageResource((i208));
        }

        if (cardNumbr == 1) {
            firstCard = cardArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }

            cardNumbr = 2;
            clickedFirst = card;
            iv.setEnabled(false);
        }
        else if(cardNumbr==2){
            secondCard = cardArray[card];
            if(secondCard>200){
                secondCard = secondCard-100;
            }
            cardNumbr=1;
            clickedSecond=card;

            q11.setEnabled(false);
            q12.setEnabled(false);
            q13.setEnabled(false);
            q14.setEnabled(false);
            q21.setEnabled(false);
            q22.setEnabled(false);
            q23.setEnabled(false);
            q24.setEnabled(false);
            q31.setEnabled(false);
            q32.setEnabled(false);
            q33.setEnabled(false);
            q34.setEnabled(false);
            q41.setEnabled(false);
            q42.setEnabled(false);
            q43.setEnabled(false);
            q44.setEnabled(false);

            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }
    private void calculate(){
        if(firstCard==secondCard) {
            if (clickedFirst == 0) {
                q11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                q12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                q13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                q14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                q21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                q22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                q23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                q24.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                q31.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                q32.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                q33.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                q34.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 12) {
                q41.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 13) {
                q42.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 14) {
                q43.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 15) {
                q44.setVisibility(View.INVISIBLE);
            }
            if (clickedSecond == 0) {
                q11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                q12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                q13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                q14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                q21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                q22.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                q23.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                q24.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                q31.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                q32.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                q33.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                q34.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 12) {
                q41.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 13) {
                q42.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 14) {
                q43.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 15) {
                q44.setVisibility(View.INVISIBLE);
            }

            if (turn == 1) {
                player1Points++;
                tv_p1.setText("P1: " + player1Points);
            } else if (turn == 2) {
                player2Points++;
                tv_p2.setText("P1: " + player2Points);
            }
        }else{
            q11.setImageResource(R.drawable.qq);
            q12.setImageResource(R.drawable.qq);
            q13.setImageResource(R.drawable.qq);
            q14.setImageResource(R.drawable.qq);
            q21.setImageResource(R.drawable.qq);
            q22.setImageResource(R.drawable.qq);
            q23.setImageResource(R.drawable.qq);
            q24.setImageResource(R.drawable.qq);
            q31.setImageResource(R.drawable.qq);
            q32.setImageResource(R.drawable.qq);
            q33.setImageResource(R.drawable.qq);
            q34.setImageResource(R.drawable.qq);
            q41.setImageResource(R.drawable.qq);
            q42.setImageResource(R.drawable.qq);
            q43.setImageResource(R.drawable.qq);
            q44.setImageResource(R.drawable.qq);

            if(turn == 1){
                turn =2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }else if(turn == 2){
                turn =1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }
        q11.setEnabled(true);
        q11.setEnabled(true);
        q12.setEnabled(true);
        q13.setEnabled(true);
        q14.setEnabled(true);
        q21.setEnabled(true);
        q22.setEnabled(true);
        q23.setEnabled(true);
        q24.setEnabled(true);
        q31.setEnabled(true);
        q32.setEnabled(true);
        q33.setEnabled(true);
        q34.setEnabled(true);
        q41.setEnabled(true);
        q42.setEnabled(true);
        q43.setEnabled(true);
        q44.setEnabled(true);
        checkEnd();

    }
    private void checkEnd(){
        if(q11.getVisibility()== View.INVISIBLE &&
                q12.getVisibility()== View.INVISIBLE &&
                q13.getVisibility()== View.INVISIBLE &&
                q14.getVisibility()== View.INVISIBLE &&
                q21.getVisibility()== View.INVISIBLE &&
                q22.getVisibility()== View.INVISIBLE &&
                q23.getVisibility()== View.INVISIBLE &&
                q24.getVisibility()== View.INVISIBLE &&
                q31.getVisibility()== View.INVISIBLE &&
                q32.getVisibility()== View.INVISIBLE &&
                q33.getVisibility()== View.INVISIBLE &&
                q34.getVisibility()== View.INVISIBLE &&
                q41.getVisibility()== View.INVISIBLE &&
                q42.getVisibility()== View.INVISIBLE &&
                q43.getVisibility()== View.INVISIBLE &&
                q44.getVisibility()== View.INVISIBLE){

            AlertDialog.Builder alertDialogBuilter = new AlertDialog.Builder(game_two.this);
            alertDialogBuilter
                    .setMessage("GAME OVER!\nP1: " + player1Points + "\nP2: " + player2Points)
                    .setCancelable(true)
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent =new Intent(getApplicationContext(), game_two.class);
                            startActivity(intent);
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilter.create();
            alertDialog.show();
        }

    }
    private void frontOfCardResources(){
        i101=R.drawable.i101;
        i102=R.drawable.i102;
        i103=R.drawable.i103;
        i104=R.drawable.i104;
        i105=R.drawable.i105;
        i106=R.drawable.i106;
        i107=R.drawable.i107;
        i108=R.drawable.i108;
        i201=R.drawable.i201;
        i202=R.drawable.i202;
        i203=R.drawable.i203;
        i204=R.drawable.i204;
        i205=R.drawable.i205;
        i206=R.drawable.i206;
        i207=R.drawable.i207;
        i208=R.drawable.i208;


    }
}
