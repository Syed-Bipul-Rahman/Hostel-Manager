package com.mpi.hostel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HostelInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel_info);

        setTitle("Hostel Info");
        getSupportActionBar().setHomeButtonEnabled(true);

    }
}