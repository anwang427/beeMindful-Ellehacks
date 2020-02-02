package com.example.ellehacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    WifiManager wifiManager;

    TextView wifiStatusTextView;

    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Variables
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiStatusTextView = (TextView) findViewById(R.id.wifi_Status_Text_View);
        toggleButton = (ToggleButton) findViewById(R.id.wifi_toggle_toggle_button);

        if (wifiManager.isWifiEnabled()) {
            wifiStatusTextView.setText("Wifi is currently ON");
            toggleButton.setChecked(true);
        } else {
            wifiStatusTextView.setText("Wifi is currently OFF");
            toggleButton.setChecked(false);
        }

        //add listener
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    wifiManager.setWifiEnabled(true);
                    wifiStatusTextView.setText("Wifi is currently ON");

                } else {
                    wifiManager.setWifiEnabled(false);
                    wifiStatusTextView.setText("Wifi is currently OFF");
                    toggleButton.setEnabled(false);

                    new CountDownTimer(5000, 1000) {
                        public void onTick(long millisUntilFinished) {
                            wifiStatusTextView.setText("Time: " + millisUntilFinished/1000);
                        }

                        public void onFinish() {
                            toggleButton.setChecked(true);
                            toggleButton.setEnabled(true);
                            wifiStatusTextView.setText("Wifi is ON");
                        }
                    }.start();


                }
            }
        });


    }




}
