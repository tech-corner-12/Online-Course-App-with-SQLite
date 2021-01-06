package com.example.wisdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class ResultActivity extends AppCompatActivity {
    TextView textview;
    RadioButton rb1,rb2,rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);

    }
    public void pay(View view){
        TextView textView = (TextView) findViewById(R.id.textview);
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.rb1:
                if (checked)
                    textView.setText("Credit Card");
                break;
            case R.id.rb2:
                if (checked)
                    textView.setText("Debit Card");
                break;
            case R.id.rb3:
                if (checked)
                    textView.setText("NetBanking");
                break;
        }
    }
    public void proceed(View view){
        Toast.makeText(ResultActivity.this, "Enrollment of your course is Sucessfully Completed", Toast.LENGTH_SHORT).show();

    }
}
