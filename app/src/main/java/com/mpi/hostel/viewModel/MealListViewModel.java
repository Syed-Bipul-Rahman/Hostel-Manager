package com.mpi.hostel.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mpi.hostel.service.model.MealData;
import com.mpi.hostel.service.repository.MealListRepository;

import java.util.List;

public class MealListViewModel extends AndroidViewModel {

    MealListRepository mealListRepository;

    public MealListViewModel(@NonNull Application application) {
        super(application);
        mealListRepository = MealListRepository.getInstance(application);
    }

    public LiveData<List<MealData>> getAllMealList() {
        return mealListRepository.getMealList();
    }

}
