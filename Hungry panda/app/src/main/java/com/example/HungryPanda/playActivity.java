package com.example.HungryPanda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class playActivity extends AppCompatActivity {
    Button back,g2,g3;
    private sound so;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        so= new sound(this);
        setContentView(R.layout.activity_play);
        back= (Button)findViewById(R.id.back);
        //g1= (Button)findViewById(R.id.G1);
        g2= (Button)findViewById(R.id.G2);
        g3= (Button)findViewById(R.id.G3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                Intent main=new Intent(playActivity.this, MainActivity.class);
                startActivity(main);
            }
        });

        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                Intent two=new Intent(playActivity.this, game_two.class);
                startActivity(two);
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                Intent three=new Intent(playActivity.this, game_three.class);
                startActivity(three);
            }
        });
    }
}
