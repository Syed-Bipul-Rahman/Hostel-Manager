package com.mpi.hostel.service.repository;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.mpi.hostel.service.model.MealData;
import com.mpi.hostel.service.model.MealList;
import com.mpi.hostel.service.network.ApiClient;
import com.mpi.hostel.service.network.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MealListRepository {

    private static Context mContext;
    private static MealListRepository instance;
    private List<MealData> mMealData;
    private MealList allMealModel;
    private MutableLiveData mLiveData;


    public static MealListRepository getInstance(Context context) {
        if (instance == null) {
            mContext = context;
            instance = new MealListRepository();

        }
        return instance;
    }


    public MutableLiveData<List<MealData>> getMealList() {
        if (mLiveData == null) {
            mLiveData = new MutableLiveData();
        }

        ApiService apiService = ApiClient.getClient().create(ApiService.class);
        Call<MealList> call = apiService.getMealList();

        call.enqueue(new Callback<MealList>() {
            @Override
            public void onResponse(Call<MealList> call, Response<MealList> response) {
                allMealModel = response.body();

                mMealData = allMealModel.getData();

                mLiveData.setValue(mMealData);
            }

            @Override
            public void onFailure(Call<MealList> call, Throwable t) {
                Toast.makeText(mContext, "Cannot fetch connect with server", Toast.LENGTH_SHORT).show();
            }
        });


        return mLiveData;


    }


}
