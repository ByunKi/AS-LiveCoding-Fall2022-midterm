package com.example.doitmission07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Toast.makeText(getApplicationContext(), "고객관리", Toast.LENGTH_LONG).show();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Toast.makeText(getApplicationContext(), "매출관리", Toast.LENGTH_LONG).show();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Toast.makeText(getApplicationContext(), "상품관리", Toast.LENGTH_LONG).show();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}