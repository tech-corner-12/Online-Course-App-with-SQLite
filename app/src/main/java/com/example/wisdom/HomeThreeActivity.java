package com.example.wisdom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeThreeActivity extends AppCompatActivity {
    TextView n,ph,bt,ad;
    Button nb,phb,btb,adb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_three);
        n=(TextView)findViewById(R.id.n);
        ph=(TextView)findViewById(R.id.ph);
        bt=(TextView)findViewById(R.id.bt);
        ad=(TextView)findViewById(R.id.ad);
        nb=(Button)findViewById(R.id.nb);
        phb=(Button)findViewById(R.id.phb);
        btb=(Button)findViewById(R.id.btb);
        adb=(Button)findViewById(R.id.adb);
    }
    public void result(View view){
        Intent intent=new Intent(HomeThreeActivity.this,ResultActivity.class);
        startActivity(intent);
    }

}
