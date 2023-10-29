package com.mpi.hostel.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.mpi.hostel.databinding.ActivityGalleryBinding;

public class GalleryActivity extends AppCompatActivity {
ActivityGalleryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityGalleryBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();

        setContentView(view);





    }
}