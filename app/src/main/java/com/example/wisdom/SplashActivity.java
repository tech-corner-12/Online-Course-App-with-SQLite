package com.example.wisdom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t=new Thread(){
            public void run(){
                try{
                    sleep(5*1000);
                    Intent intent=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch(Exception e) {
                }
            }
        };
        t.start();
    }
}
