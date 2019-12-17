package com.example.HungryPanda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class setting extends AppCompatActivity {
    Button back;
    private sound so;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        so= new sound(this);
        setContentView(R.layout.activity_setting);
        back= (Button)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.playclick();
                Intent game1=new Intent(setting.this, MainActivity.class);
                startActivity(game1);
            }
        });
    }
}
