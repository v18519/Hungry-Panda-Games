package com.example.HungryPanda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn_play,btn_setting, btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        //txt1= (TextView)findViewById(R.id.textView1);
       // txt2= (TextView)findViewById(R.id.textView2);
        btn_play= (Button)findViewById(R.id.play);
        btn_setting= (Button)findViewById(R.id.setting);
        btn_exit= (Button)findViewById(R.id.exit);
       // btn2= (Button)findViewById(R.id.button2);
        //btn2.setOnClickListener(this);
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(MainActivity.this, playActivity.class);
                startActivity(one);
            }
        });
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(MainActivity.this, s.class);
                startActivity(two);
            }
        });
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());


               // Intent three=new Intent(MainActivity.this, playActivity.class);
               // startActivity(three);
            }
        });


        }


    }
       /* btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("Button 1 click");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,playActivity.class);
                startActivity(intent);
                //txt1.setText("Button 2 click");
            }
        });*/


