package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mpi.hostel.databinding.ActivityMainBinding;
import com.mpi.hostel.service.model.Students;
import com.mpi.hostel.viewModel.StudentListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    //declaring global variables
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);




        //sending to hostel info
        binding.sentinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HostelInfoActivity.class));
            }
        });
        //sending to studentllist
        binding.cardviewstudentlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, StudentListActivity.class));
            }
        });


    }


}