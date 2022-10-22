package com.example.samplescrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView sv;
    ImageView iv;
    BitmapDrawable bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sv = findViewById(R.id.SV);
        iv = findViewById(R.id.imageView);
        sv.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bd = (BitmapDrawable) res.getDrawable(R.drawable.scl_image01);
        int bdWidth = bd.getIntrinsicWidth();
        int bdHeight = bd.getIntrinsicHeight();

        iv.setImageDrawable(bd);
        iv.getLayoutParams().width = bdWidth;
        iv.getLayoutParams().height = bdHeight;
    }

    public void onButtonClicked(View view) {
        changeImg();
    }

    private void changeImg() {
        Resources res = getResources();
        bd = (BitmapDrawable) res.getDrawable(R.drawable.scl_image02);
        int bdWidth = bd.getIntrinsicWidth();
        int bdHeight = bd.getIntrinsicHeight();

        iv.setImageDrawable(bd);
        iv.getLayoutParams().width = bdWidth;
        iv.getLayoutParams().height = bdHeight;
    }
}