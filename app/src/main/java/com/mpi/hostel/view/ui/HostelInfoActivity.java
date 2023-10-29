package com.mpi.hostel.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.mpi.hostel.R;

public class HostelInfoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel_info);

        setTitle("Hostel Info");
//        getActionBar().setHomeButtonEnabled(true);
       // getActionBar().setDefaultDisplayHomeAsUpEnabled(true);



    }
}