package com.mpi.hostel.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mpi.hostel.service.model.Notice;
import com.mpi.hostel.service.model.SingleAdmin;
import com.mpi.hostel.service.repository.AllAdminRepository;

import java.util.List;

public class AdminListViewModel extends AndroidViewModel {
    AllAdminRepository allAdminRepository;

    public AdminListViewModel(@NonNull Application application) {
        super(application);

        allAdminRepository = AllAdminRepository.getInstance(application);
    }

    public LiveData<List<SingleAdmin>> getAllAdmin() {
        return allAdminRepository.getAdminList();
    }


}
