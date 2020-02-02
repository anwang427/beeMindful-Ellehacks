package com.beemindful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newuser1 extends AppCompatActivity {

    private Button newU1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser1);

        newU1 = (Button) findViewById(R.id.newU1);

        newU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNew2();
            }
        });
    }

    private void openNew2() {
        Intent intent = new Intent(this, newuser2.class);
        startActivity(intent);
    }
}
