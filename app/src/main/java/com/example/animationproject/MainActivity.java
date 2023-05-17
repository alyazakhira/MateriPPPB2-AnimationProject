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
//        mAnimator = ObjectAnimator.ofFloat(imageView, "rotationX", 180);
//        mAnimator = ObjectAnimator.ofFloat(imageView, "rotationY", 180);

        // position animator
        // final location of the view in the container
//        mAnimator = ObjectAnimator.ofFloat(imageView, "x", 300);
//        mAnimator = ObjectAnimator.ofFloat(imageView, "y", 300);
        // location according to start position
//        mAnimator = ObjectAnimator.ofFloat(imageView, "translationX", 300);
//        mAnimator = ObjectAnimator.ofFloat(imageView, "translationY", 300);

        // scale animator
//        mAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 180);
//        mAnimator = ObjectAnimator.ofFloat(imageView, "scaleY", 180);

        // transparency animator
        mAnimator = ObjectAnimator.ofFloat(imageView, "alpha", 0);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimator.setDuration(1000);
                mAnimator.start();
                // if you need to do several animation, insert the animation into different animator, set and start it.
            }
        });
    }
}