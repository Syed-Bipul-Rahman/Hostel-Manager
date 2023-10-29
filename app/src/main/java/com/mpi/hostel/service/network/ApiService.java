package com.mpi.hostel.service.network;

import com.mpi.hostel.service.model.AllStudents;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("all-students.php")
    Call<AllStudents> getAllStudentsLists();

}
