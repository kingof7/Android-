package com.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub); //id 연결

        Intent intent = getIntent(); // activity_main.xml에서 넘겨준 ㄷ데이터를ㄹ 받음
        String str = intent.getStringExtra("str"); // 날아온 String값을 받아줄 것이다.

        tv_sub.setText(str);
    }
}