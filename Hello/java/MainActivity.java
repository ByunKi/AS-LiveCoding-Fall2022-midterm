package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {
        Toast.makeText(this, "확인", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClicked1(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com/")));
    }

    public void onButtonClicked2(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0000")));
    }
}