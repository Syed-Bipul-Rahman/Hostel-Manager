package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.databinding.ActivityNoticeDetailsBinding;

public class NoticeDetails extends AppCompatActivity {
   ActivityNoticeDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNoticeDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title"), desc = intent.getStringExtra("desc");

        binding.textView5.setText(title);
        binding.textView4.setText(desc);


    }
}