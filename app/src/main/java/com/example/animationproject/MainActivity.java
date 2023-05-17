package com.example.animationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ObjectAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image);
        Button button = findViewById(R.id.btn_animate);

        // rotation animator
//        mAnimator = ObjectAnimator.ofFloat(imageView, "rotation", 180);

        // position animator
//        mAnimator = ObjectAnimator.ofFloat(imageView, "x", 300);
        mAnimator = ObjectAnimator.ofFloat(imageView, "y", 300);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimator.setDuration(1000);
                mAnimator.start();
            }
        });
    }
}