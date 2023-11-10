package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.databinding.ActivityStudentDetailsBinding;

public class StudentDetails extends AppCompatActivity {
    ActivityStudentDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudentDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        Intent intent;

        intent = getIntent();
        //getting all passed value
        String studentName = intent.getStringExtra("name");
        String studentphonenumbr = intent.getStringExtra("studentphonenumbr");
        String studentmother = intent.getStringExtra("studentmother");
        String studentfather = intent.getStringExtra("studentfather");
        String studentfatgerphonenumbr = intent.getStringExtra("studentfatgerphonenumbr");
        String studentDistrict = intent.getStringExtra("studentDistrict");
        String studentUpazila = intent.getStringExtra("studentUpazila");
        //address =district+upazila
        String address = studentUpazila + ", " + studentDistrict;

        String studentRoll = intent.getStringExtra("studentRoll");
        String studentRegistration = intent.getStringExtra("studentRegistration");
        String studentSession = intent.getStringExtra("studentSession");


        //setting info on textview
        binding.studentnamede.setText(studentName);
        binding.studentphoneno.setText(studentphonenumbr);
        binding.studentphonenono.setText(studentphonenumbr);
        binding.studentmothername.setText(studentmother);
        binding.studentfathername.setText(studentfather);
        binding.studentfatehrphone.setText(studentfatgerphonenumbr);
        binding.studentlocations.setText(address + ", Bangladesh");

        binding.studentRoll.setText(studentRoll);
        binding.studentRegistration.setText(studentRegistration);
        binding.studentSession.setText(studentSession);

        String split[] = studentName.split(" ");
        if (split.length >= 2) {
            String firstname = split[0];
            String secondname = split[1];
            setTitle(firstname + " " + secondname);
        } else {
            String firstname = split[0];
            setTitle(firstname);
        }

    }
}