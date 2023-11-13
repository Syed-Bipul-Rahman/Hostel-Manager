package com.mpi.hostel.service.repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.mpi.hostel.service.model.AllNotice;
import com.mpi.hostel.service.model.Notice;
import com.mpi.hostel.service.model.resultModel.AllResult;
import com.mpi.hostel.service.model.resultModel.ResultDatum;
import com.mpi.hostel.service.network.ApiClient;
import com.mpi.hostel.service.network.ApiClient2;
import com.mpi.hostel.service.network.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllResultRepository {

    private static Context mContext;
    private static AllResultRepository instance;
    private List<ResultDatum> mResult;
    private AllResult allResultModel;
    private MutableLiveData mLiveData;

    public static AllResultRepository getInstance(Context context) {
        if (instance == null) {
            mContext = context;
            instance = new AllResultRepository();

        }
        return instance;
    }

    public MutableLiveData<List<ResultDatum>> getResultList() {
        if (mLiveData == null) {
            mLiveData = new MutableLiveData();
        }

        ApiService apiService = ApiClient2.getClient().create(ApiService.class);
        Call<AllResult> call = apiService.getAllResult();
        call.enqueue(new Callback<AllResult>() {
            @Override
            public void onResponse(Call<AllResult> call, Response<AllResult> response) {
                allResultModel = response.body();

                mResult = allResultModel.getResultData();

                mLiveData.setValue(mResult);
            }

            @Override
            public void onFailure(Call<AllResult> call, Throwable t) {

            }
        });



        return mLiveData;

    }

}
