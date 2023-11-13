package com.mpi.hostel.view.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.databinding.ActivityAboutDeveloperBinding;

public class AboutDeveloperActivity extends AppCompatActivity {
    ActivityAboutDeveloperBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAboutDeveloperBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().hide();



    }
}