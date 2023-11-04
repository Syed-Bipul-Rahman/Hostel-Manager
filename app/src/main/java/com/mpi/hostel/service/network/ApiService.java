package com.mpi.hostel.service.network;

import com.mpi.hostel.service.model.AllAdmin;
import com.mpi.hostel.service.model.AllNotice;
import com.mpi.hostel.service.model.AllStudents;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    //student list
    @GET("all-students.php")
    Call<AllStudents> getAllStudentsLists();

    //all notice
    @GET("notice.php")
    Call<AllNotice> getAllNotice();

    //all notice
    @GET("hall-admin.php")
    Call<AllAdmin> getAllAdmin();


}
