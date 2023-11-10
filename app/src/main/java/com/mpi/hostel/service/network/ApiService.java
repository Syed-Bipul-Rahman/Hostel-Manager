package com.mpi.hostel.service.network;

import com.mpi.hostel.service.model.AllAdmin;
import com.mpi.hostel.service.model.AllNotice;
import com.mpi.hostel.service.model.AllStudents;
import com.mpi.hostel.service.model.LoginModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

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


    @FormUrlEncoded
    @POST("login.php")
    Call<LoginModel> getLogin(@Field("roll") String roll,
                              @Field("registration") String registration);

    @FormUrlEncoded
    @POST("register.php")
    Call<LoginModel> registerUser(@Field("name") String name,
                                  @Field("roll") String roll,
                                  @Field("registration") String registration,
                                  @Field("phone") String phone,
                                  @Field("father") String father,
                                  @Field("fatherphone") String fatherphone,
                                  @Field("mother") String mother,
                                  @Field("dist") String dist,
                                  @Field("upzila") String upzila,
                                  @Field("session") String session,
                                  @Field("password") String password);


}
