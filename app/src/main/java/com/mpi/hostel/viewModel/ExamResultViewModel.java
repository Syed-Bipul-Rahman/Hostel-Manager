package com.mpi.hostel.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mpi.hostel.service.model.resultModel.ResultDatum;
import com.mpi.hostel.service.repository.AllResultRepository;

import java.util.List;

public class ExamResultViewModel extends AndroidViewModel {

    AllResultRepository allResultRepository;

    public ExamResultViewModel(@NonNull Application application) {
        super(application);

        allResultRepository = AllResultRepository.getInstance(application);

    }

    public LiveData<List<ResultDatum>> getAllResult() {
        return allResultRepository.getResultList();
    }

}
