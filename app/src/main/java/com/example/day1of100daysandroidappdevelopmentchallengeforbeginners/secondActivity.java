package com.example.day1of100daysandroidappdevelopmentchallengeforbeginners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class secondActivity extends AppCompatActivity {


    private TextView text2;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text2 = (TextView)findViewById(R.id.text2);
        button2 = (Button)findViewById(R.id.button2);

        Random ran = new Random();
        int num2 = ran.nextInt();

        text2.setText(String.valueOf(num2));

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
