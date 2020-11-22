package com.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_text;
    private String str;
    private ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //안에있는 구문을 쫙실행행
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_text = findViewById(R.id.et_text);
        btn_move = findViewById(R.id.btn_move); //찾아와라
        btn_move.setOnClickListener(new View.OnClickListener() { //아래 함수를 실행할 것
            @Override
            public void onClick(View v) {
                str = et_text.getText().toString(); // 데이터 넣고
                Intent intent = new Intent(MainActivity.this, SubActivity.class); //Main -> Sub로 이동
                intent.putExtra("str", str); //str을 받아서 "str"로 sub에 넘겨줌
                startActivity(intent); //Main -> Sub로 이동함수
            }
        });

        test = (ImageView) findViewById(R.id.test); // test변수는 ImageView를 가지고 온 것
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "홍드로이드 잘생김", Toast.LENGTH_SHORT).show(); // 이미지 클릭시 토스트 메시지 띄워짐
            }
        });





    }
}