package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.content.SharedPreferences;
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
        binding.sentinfo.setOnClickListener(v -> {
            //  Toast.makeText(this, "sending..", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, HostelInfoActivity.class));
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
                //check user is already login or not
                SharedPreferences sharedPreferences = getSharedPreferences("login_pref", MODE_PRIVATE);
                String storedUserName = sharedPreferences.getString("USER_NAME", "");

                if (!storedUserName.isEmpty())
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

//sending to about 
        binding.aboutapp.setOnClickListener(v -> {
            //     Toast.makeText(this, "sending............", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, AboutDeveloperActivity.class));

        });

        //navigate to register

        binding.applyasStuent.setOnClickListener(v -> {
            //     Toast.makeText(this, "sending............", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));

        });

    }


}