package com.example.kuafortasarim;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import yanzhikai.textpath.SyncTextPathView;

public class SplashBackActivity extends AppCompatActivity {

    SyncTextPathView baslik, second_baslik, baslik_first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_back);
        baslik = findViewById(R.id.baslik);
        baslik_first = findViewById(R.id.baslik_first);
        second_baslik = findViewById(R.id.second_baslik);
        second_baslik.startAnimation(0, 1);
        baslik_first.startAnimation(0, 1);
        baslik.startAnimation(0, 1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), SplashActivity.class));
                finish();
            }
        }, 6000);
    }
}
