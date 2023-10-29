package com.mpi.hostel.service.repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.mpi.hostel.service.model.AllStudents;
import com.mpi.hostel.service.model.Students;
import com.mpi.hostel.service.network.ApiClient;
import com.mpi.hostel.service.network.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllStudentsRepository {

    private static Context mContext;
    private static AllStudentsRepository instance;
    private List<Students> mStudents;
    private AllStudents allStudentsModel;
    private MutableLiveData mLiveData;


    public static AllStudentsRepository getInstance(Context context) {

        if (instance == null) {
            mContext = context;
            instance = new AllStudentsRepository();

        }
        return instance;

    }

    public MutableLiveData<List<Students>> getStudentList() {


        if (mLiveData == null) {
            mLiveData = new MutableLiveData();
        }


        ApiService apiService = ApiClient.getClient().create(ApiService.class);

        Call<AllStudents> call = apiService.getAllStudentsLists();


        call.enqueue(new Callback<AllStudents>() {
            @Override
            public void onResponse(Call<AllStudents> call, Response<AllStudents> response) {
                allStudentsModel = response.body();
                mStudents = allStudentsModel.getData();
                mLiveData.setValue(mStudents);

//                movieModel = response.body();
//                mResult = movieModel.getResults();
//
//                mLiveData.postValue(mResult);


            }

            @Override
            public void onFailure(Call<AllStudents> call, Throwable t) {

            }
        });

        return mLiveData;
    }


}
