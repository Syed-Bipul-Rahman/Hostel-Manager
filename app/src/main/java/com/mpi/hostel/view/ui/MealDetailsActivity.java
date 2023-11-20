package com.mpi.hostel.view.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mpi.hostel.databinding.ActivityMealDetailsBinding;
import com.mpi.hostel.service.model.MealData;
import com.mpi.hostel.view.adapter.MealAdapter;
import com.mpi.hostel.viewModel.MealListViewModel;

import java.util.List;

public class MealDetailsActivity extends AppCompatActivity {
    ActivityMealDetailsBinding binding;

    MealListViewModel mealListViewModel;
    MealAdapter mealAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMealDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.mealCostlist.setLayoutManager(new LinearLayoutManager(this));


        mealListViewModel = new ViewModelProvider(this).get(MealListViewModel.class);

        mealListViewModel.getAllMealList().observe(this, new Observer<List<MealData>>() {
            @Override
            public void onChanged(List<MealData> mealData) {


                mealAdapter = new MealAdapter(MealDetailsActivity.this, mealData);
                binding.mealCostlist.setAdapter(mealAdapter);
                mealAdapter.notifyDataSetChanged();
            }
        });


    }
}