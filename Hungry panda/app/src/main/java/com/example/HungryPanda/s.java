package com.example.HungryPanda;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class s extends AppCompatActivity {
    Button exit, info1, info2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);
        exit= (Button)findViewById(R.id.exit);
        info1=(Button)findViewById(R.id.Button2) ;
        info2=(Button)findViewById(R.id.Button3);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game1=new Intent(s.this, MainActivity.class);
                startActivity(game1);
            }
        });
        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilter = new AlertDialog.Builder(s.this);
                alertDialogBuilter
                        .setMessage("Search panda is a two player memory game.")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilter.create();
                alertDialog.show();
            }
        });
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilter = new AlertDialog.Builder(s.this);
                alertDialogBuilter
                        .setMessage("Quick panda is a two player raction game. Use start button to start countdown and click quickly 20 times on panda image to win the game")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilter.create();
                alertDialog.show();
            }
        });

    }
}
