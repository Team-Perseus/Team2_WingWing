package com.example.realwing;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_activity);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView);

        Resources res=getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.imsi_aed);
        imageView.setImageDrawable(bitmap);

        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void onClickBtnAed(View view) {
        chanegeImage(0);
    }

    public void onClickBtnCpr(View view) {
        chanegeImage(1);
    }

    private void chanegeImage(int imageIndex) {
        if (imageIndex == 0) {
            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.imsi_aed);
            imageView.setImageDrawable(bitmap);
        } else if (imageIndex == 1) {
            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.imsi_cpr);
            imageView.setImageDrawable(bitmap);
        }

    }

}
