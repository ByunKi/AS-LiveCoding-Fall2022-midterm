package com.example.sampleframelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView v1, v2;
    int imgIdx = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.imageView);
        v2 = findViewById(R.id.imageView2);
    }

    public void onButtonClicked(View view) {
        changeImg();
    }

    private void changeImg() {
        if (imgIdx == 0) {
            v1.setVisibility(View.INVISIBLE);
            v2.setVisibility(View.VISIBLE);
            imgIdx = 1;
        } else if (imgIdx == 1) {
            v2.setVisibility(View.INVISIBLE);
            v1.setVisibility(View.VISIBLE);
            imgIdx = 0;
        }
    }
}