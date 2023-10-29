package com.mpi.hostel.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mpi.hostel.service.model.Students;
import com.mpi.hostel.service.repository.AllStudentsRepository;

import java.util.List;

public class StudentListViewModel extends AndroidViewModel {


    AllStudentsRepository allStudentsRepository;


    public StudentListViewModel(@NonNull Application application) {
        super(application);

        allStudentsRepository = AllStudentsRepository.getInstance(application);
    }


    public LiveData<List<Students>> getAllStudentList() {
        return allStudentsRepository.getStudentList();
    }


}
