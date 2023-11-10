package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.databinding.ActivityMainBinding;

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
        //sending to gallery
        binding.gallerycardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GalleryActivity.class));
            }
        });
        //sending to dashboard
        binding.cardviewdashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getSharedPreferences("login_pref", MODE_PRIVATE).getBoolean("is_logged_in", false))
                    startActivity(new Intent(MainActivity.this, DashboardActivity.class));
                else {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }

            }
        });
        //sending to notice
        binding.notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NoticeActivity.class));
            }
        });
        //sending to admininfo
        binding.hostelStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AdminActivity.class));
            }
        });


    }


}