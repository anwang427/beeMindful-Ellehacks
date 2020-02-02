package com.beemindful;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class dChallenge extends AppCompatActivity {

    public Map<Integer, String> days = new HashMap<Integer, String>();

    public dChallenge(){
        days.put (1, "Sunday");
        days.put (2, "Monday");
        days.put (3, "Tuesday");
        days.put (4, "Wednesday");
        days.put (5, "Thursday");
        days.put (6, "Friday");
        days.put (7, "Saturday");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_challenge);

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        TextView textViewDate = findViewById(R.id.dateView);
        textViewDate.setText(days.get(day));

        ImageView challengeView = (ImageView) findViewById(R.id.challengeView);
        //challengeView.setImageResource(R.drawable.image_two);
        if(day == 1){
            challengeView.setImageResource(R.drawable.sunday);
        }

        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox2);
        if (checkBox.isChecked()) {
            System.out.println("IS CHECKED");
        }

    }

}
