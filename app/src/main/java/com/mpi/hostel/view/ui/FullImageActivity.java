package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.databinding.ActivityFullImageBinding;

public class FullImageActivity extends AppCompatActivity {
    ActivityFullImageBinding binding;
    int imageId;
    private ScaleGestureDetector scaleGestureDetector;
    private float mScaleFactor = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFullImageBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();
        setContentView(view);


        Intent intent = getIntent();

        imageId = intent.getIntExtra("imageId", 0);

        binding.fullImage.setImageResource(imageId);

// Initialize ScaleGestureDetector
        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // Pass touch events to ScaleGestureDetector
        scaleGestureDetector.onTouchEvent(event);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            mScaleFactor *= detector.getScaleFactor();

            // Limit the scale to a certain range, for instance, between 0.1f and 5.0f
            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor, 5.0f));

            // Set the scale to the ImageView
            binding.fullImage.setScaleX(mScaleFactor);
            binding.fullImage.setScaleY(mScaleFactor);

            return true;
        }
    }
}