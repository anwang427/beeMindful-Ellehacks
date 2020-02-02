package com.beemindful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class unlocked extends AppCompatActivity {

    private Button invest, nothx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlocked);

        invest = (Button) findViewById(R.id.invest);
        invest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                invest();
            }
        });

        nothx = (Button) findViewById(R.id.next_time);
        nothx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });

    }

    private void goBack() {
        Intent intent = new Intent(this, existingUser.class);
        startActivity(intent);
    }

    private void invest() {
        Intent intent = new Intent(this, incentives.class);/////change
        startActivity(intent);
    }
}
