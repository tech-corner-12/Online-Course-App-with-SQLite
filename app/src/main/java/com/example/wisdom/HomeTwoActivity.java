package com.example.wisdom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeTwoActivity extends AppCompatActivity {
    TextView js,p,cpp,cc;
    Button jsb,pb,cppb,ccb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_two);
        js=(TextView)findViewById(R.id.js);
        p=(TextView)findViewById(R.id.p);
        cpp=(TextView)findViewById(R.id.cpp);
        cc=(TextView)findViewById(R.id.cc);
        jsb=(Button)findViewById(R.id.jsb);
        pb=(Button)findViewById(R.id.pb);
        cppb=(Button)findViewById(R.id.cppb);
        ccb=(Button)findViewById(R.id.ccb);

    }
    public void next2(View view){
        Intent intent=new Intent(HomeTwoActivity.this,HomeThreeActivity.class);
        startActivity(intent);
    }
    public void result(View view){
        Intent intent=new Intent(HomeTwoActivity.this,ResultActivity.class);
        startActivity(intent);
    }
}
