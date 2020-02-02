package com.beemindful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class incentives extends AppCompatActivity {

    private Button finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incentives);

        finish = findViewById(R.id.final_invest);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumbit();
            }
        });
    }


    private void sumbit() {
        Intent intent = new Intent(this, thankyou.class);
        startActivity(intent);
    }
}
