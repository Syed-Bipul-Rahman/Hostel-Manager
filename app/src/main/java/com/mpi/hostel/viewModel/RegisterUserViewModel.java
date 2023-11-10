package com.mpi.hostel.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mpi.hostel.service.model.LoginModel;
import com.mpi.hostel.service.repository.RegisterRepository;

public class RegisterUserViewModel extends AndroidViewModel {

    RegisterRepository registerRepository;

    public RegisterUserViewModel(@NonNull Application application) {
        super(application);
        registerRepository = RegisterRepository.getInstance(application);


    }

    public LiveData<LoginModel> registerUser(String name, String roll, String registration, String phone, String father, String fatherphone, String mother, String dist, String upzila, String session, String password) {
        if (registerRepository != null) {
            return registerRepository.registerUser(name, roll, registration, phone, father, fatherphone, mother, dist, upzila, session, password);
        }
        return null;
    }
}
