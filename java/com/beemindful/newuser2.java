package com.beemindful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newuser2 extends AppCompatActivity {

    private Button newU2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser2);


        newU2 = (Button) findViewById(R.id.newU1);

        newU2.setOnClickListener(new View.OnClickListener() {
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
}
