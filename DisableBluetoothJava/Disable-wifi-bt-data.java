package com.example.ellehacks2;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

   
    //CALL THIS METHOD WHEN YOU WANT TO DISABLE BLUETOOTH
    //returns 1 if BT is enaabled
    public int disableBT() {
        BluetoothAdapter BTA = BluetoothAdapter.getDefaultAdapter();
        int x = 0;
        if (BTA.isEnabled()) {
            x = 1;
        }
        return x;
    }

    //returns 1 if BT is enabled
    public int disableWifi() {
        WifiManager wMgmt = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        int x = 0;
        if (
                wMgmt.isWifiEnabled()) {
            x = 1;
        }
        return x;
    }


    public int restrictData(){
        ConnectivityManager cMgmt = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    
        if (connMgr.isActiveNetworkMetered()) {
            RESTRICT_BACKGROUND_STATUS_ENABLED;
        }
    
    
    }
}

