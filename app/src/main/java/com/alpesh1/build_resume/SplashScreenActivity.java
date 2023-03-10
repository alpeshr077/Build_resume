package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView imgLogo;
    TextView txtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imgLogo = findViewById(R.id.imgLogo);
        txtText = findViewById(R.id.txtText);

        Animation animation = AnimationUtils.loadAnimation(SplashScreenActivity.this,R.anim.splashscreen_image_animation);
        imgLogo.startAnimation(animation);
        txtText.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
                finish();
            }
        },4000);

    }
}