package com.beemindful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class existingUser extends AppCompatActivity {

    private Button seeDC, iCT, LOCK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_user);


        seeDC = (Button) findViewById(R.id.seeDC);
        iCT = (Button) findViewById(R.id.iCT);
        LOCK = (Button) findViewById(R.id.LOCK);

        seeDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDC();
            }
        });
        iCT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openICT();
            }
        });
        LOCK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lock();
            }
        });

    }

    private void openDC() {
        Intent intent = new Intent(this, dChallenge.class);/////change
        startActivity(intent);
    }

    private void openICT(){
        Intent intent = new Intent(this, incentives.class);/////change
        startActivity(intent);
    }

    private void lock(){
        Intent intent = new Intent(this, locked.class);/////change
        startActivity(intent);

    }
}
