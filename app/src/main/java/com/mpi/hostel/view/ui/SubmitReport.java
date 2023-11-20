package com.mpi.hostel.view.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.databinding.ActivitySubmitReportBinding;

public class SubmitReport extends AppCompatActivity {
    ActivitySubmitReportBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubmitReportBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.submitReport.setOnClickListener(v -> {

            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        });
    }
}