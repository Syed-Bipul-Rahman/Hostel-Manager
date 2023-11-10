package com.mpi.hostel.service.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mpi.hostel.service.model.LoginModel;
import com.mpi.hostel.service.network.ApiClient;
import com.mpi.hostel.service.network.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterRepository {
    private static Context mContext;
    private static RegisterRepository instance;
    private MutableLiveData<LoginModel> mLiveData;


    public static RegisterRepository getInstance(Context context) {
        if (instance == null) {
            mContext = context;
            instance = new RegisterRepository();
        }
        return instance;
    }

    public LiveData<LoginModel> registerUser(String name, String roll, String registration, String phone, String father, String fatherPhone, String mother, String dist, String upazila, String session, String password) {
        if (mLiveData == null) {
            mLiveData = new MutableLiveData<>();
        }
        ApiService apiService = ApiClient.getClient().create(ApiService.class);

        Call<LoginModel> call = apiService.registerUser(name, roll, registration, phone, father, fatherPhone, mother, dist, upazila, session, password);
        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                if (response.isSuccessful()) {
                    LoginModel loginResponse = response.body();
                    mLiveData.setValue(loginResponse);
                } else {
                    // Handle API error here (e.g., parsing error response, logging, etc.)
                    mLiveData.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                mLiveData.setValue(null);
            }
        });

        return mLiveData;
    }

}
