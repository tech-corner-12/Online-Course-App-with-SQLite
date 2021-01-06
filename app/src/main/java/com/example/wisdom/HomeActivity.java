package com.example.wisdom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView c,j,h,css;
    Button cb,jb,hb,cssb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        c=(TextView)findViewById(R.id.c);
        j=(TextView)findViewById(R.id.j);
        h=(TextView)findViewById(R.id.h);
        css=(TextView)findViewById(R.id.css);
        cb=(Button)findViewById(R.id.cb);
        jb=(Button)findViewById(R.id.jb);
        hb=(Button)findViewById(R.id.hb);
        cssb=(Button)findViewById(R.id.cssb);

    }
    public void next(View view){
        Intent intent=new Intent(HomeActivity.this,HomeTwoActivity.class);
        startActivity(intent);
    }
    public void result(View view){
        Intent intent=new Intent(HomeActivity.this,ResultActivity.class);
        startActivity(intent);
    }
}
