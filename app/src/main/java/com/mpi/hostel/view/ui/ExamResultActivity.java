package com.mpi.hostel.view.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mpi.hostel.R;
import com.mpi.hostel.databinding.ActivityExamResultBinding;
import com.mpi.hostel.service.model.resultModel.ResultDatum;
import com.mpi.hostel.view.adapter.StudentResultAdapter;
import com.mpi.hostel.viewModel.ExamResultViewModel;

import java.util.List;

public class ExamResultActivity extends AppCompatActivity {
    ActivityExamResultBinding binding;
    ExamResultViewModel viewModel;
    StudentResultAdapter adapter;

    List<ResultDatum> mymodelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExamResultBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.resultRecycler.setLayoutManager(new LinearLayoutManager(this));

        viewModel = new ViewModelProvider(this).get(ExamResultViewModel.class);

        //setonllicklistener
        binding.viewResult.setOnClickListener(v -> {
            String roll = binding.giveRoll.getText().toString();
            String regulation = binding.regulationId.getSelectedItem().toString();
            binding.progressBarLoding.setVisibility(View.VISIBLE);
            //validating input before send request to server
            if (roll.isEmpty() || roll.length() < 6 || regulation.equals("Regulation")) {

                binding.progressBarLoding.setVisibility(View.GONE);
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                // Set the title and messages
                builder.setTitle("Opps...")
                        .setIcon(R.drawable.ic_round_warning_amber_24)
                        .setMessage("Please provide your roll and select your regulation. eg: 2016 or 2022 ")
                        .setCancelable(true)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // Do something if the user clicks OK
                                dialog.dismiss();
                            }
                        });

                AlertDialog alert = builder.create();
                alert.show();
                return;

            }


            viewModel.getAllResult(roll, regulation).observe(this, new Observer<List<ResultDatum>>() {
                @Override
                public void onChanged(List<ResultDatum> resultData) {

                    mymodelList = resultData;
                    adapter = new StudentResultAdapter(ExamResultActivity.this, resultData);

                    binding.resultRecycler.setAdapter(adapter);


                    //remove observer
                    viewModel.getAllResult(roll, regulation).removeObserver(this);
                    binding.progressBarLoding.setVisibility(View.GONE);
                }
            });

        });

    }
}