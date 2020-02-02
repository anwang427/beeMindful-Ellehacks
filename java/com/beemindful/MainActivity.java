package com.beemindful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button newU, exU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singletonObject single = new singletonObject();

        System.out.println(single.points);

        newU = (Button) findViewById(R.id.newuser);
        exU  = (Button) findViewById(R.id.exU);

        newU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNew();
            }
        });
        exU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEx();
            }
        });
    }

    private void openEx() {
        Intent intent = new Intent(this, existingUser.class);
        startActivity(intent);
    }

    private void openNew() { // opens new page
        Intent intent = new Intent(this, newuser1.class);
        startActivity(intent);
    }



}
