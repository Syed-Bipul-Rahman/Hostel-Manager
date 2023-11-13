package com.mpi.hostel.view.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mpi.hostel.databinding.ActivityExamResultBinding;
import com.mpi.hostel.service.model.resultModel.ResultDatum;
import com.mpi.hostel.viewModel.ExamResultViewModel;
import com.mpi.hostel.viewModel.StudentListViewModel;

import java.util.List;

public class ExamResultActivity extends AppCompatActivity {
    ActivityExamResultBinding binding;
    ExamResultViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExamResultBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        viewModel = new ViewModelProvider(this).get(ExamResultViewModel.class);

        viewModel.getAllResult().observe(this, new Observer<List<ResultDatum>>() {
            @Override
            public void onChanged(List<ResultDatum> resultData) {
                Toast.makeText(ExamResultActivity.this, ""+resultData.get(0).getSemester().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        //setonllicklistener
        binding.viewResult.setOnClickListener(v -> {
            String roll = binding.giveRoll.getText().toString();
            String regulation = binding.regulationId.getSelectedItem().toString();


            Toast.makeText(this, "your texts is: " + roll + " " + regulation, Toast.LENGTH_SHORT).show();
        });

    }
}