package com.example.hola;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActiviy(new Intent(splashActivity.this,MainActivity.class));
                finish();
            }
        }, delayMillis: 3000);
    }
}