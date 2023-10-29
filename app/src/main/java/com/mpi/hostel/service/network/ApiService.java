package com.mpi.hostel.service.network;

import com.mpi.hostel.service.model.AllStudents;
import com.mpi.hostel.service.model.FullResults;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {
    @GET("all-students.php")
    Call<AllStudents> getAllStudentsLists();


  //  individualResult?roll=476732&regulation=2016


    @GET()
    Call<FullResults> getFullResults(@Url String url);
}
