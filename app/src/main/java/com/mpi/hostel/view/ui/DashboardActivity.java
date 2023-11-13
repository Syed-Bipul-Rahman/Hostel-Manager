package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {
    ActivityDashboardBinding binding;
    String userName, userPhone;
    Integer userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setTitle("Dashboard");

//set user data into dashboar  from sharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("login_pref", MODE_PRIVATE);
        userName = sharedPreferences.getString("USER_NAME", "");
        userPhone = sharedPreferences.getString("USER_PHONE", "");
        userId = sharedPreferences.getInt("USER_ID", 0);

        binding.username.setText(userName);
        binding.userPhone.setText(userPhone);



        //navigate to Result activity

        binding.viewResult.setOnClickListener(v->{
            startActivity(new Intent(DashboardActivity.this,ExamResultActivity.class));
        });


    }
}