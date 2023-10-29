package com.mpi.hostel.view.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mpi.hostel.databinding.ActivityStudentListBinding;
import com.mpi.hostel.service.model.Students;
import com.mpi.hostel.view.adapter.StudentsAdapter;
import com.mpi.hostel.viewModel.StudentListViewModel;

import java.util.List;

public class StudentListActivity extends AppCompatActivity {
    ActivityStudentListBinding binding;

    StudentListViewModel viewModel;
    StudentsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudentListBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setTitle("Student List");

        binding.studentsRecycler.setLayoutManager(new LinearLayoutManager(this));


        // Log.d("change", "oncreate");

        viewModel = new ViewModelProvider(this).get(StudentListViewModel.class);
        viewModel.getAllStudentList().observe(this, new Observer<List<Students>>() {
            @Override
            public void onChanged(List<Students> students) {
//                Log.d("change", students.get(1).getFatherphone());
    //          Toast.makeText(StudentListActivity.this, students.get(1).getPhone().toString(), Toast.LENGTH_SHORT).show();
                binding.progressBar.setVisibility(View.GONE);
                adapter = new StudentsAdapter(StudentListActivity.this, students);
                binding.studentsRecycler.setAdapter(adapter);
                binding.studentsRecycler.setVisibility(View.VISIBLE);

            }
        });


    }
}