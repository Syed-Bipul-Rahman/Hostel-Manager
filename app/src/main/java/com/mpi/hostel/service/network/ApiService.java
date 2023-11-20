package com.mpi.hostel.service.network;

import com.mpi.hostel.service.model.AllAdmin;
import com.mpi.hostel.service.model.AllNotice;
import com.mpi.hostel.service.model.AllStudents;
import com.mpi.hostel.service.model.LoginModel;
import com.mpi.hostel.service.model.MealList;
import com.mpi.hostel.service.model.resultModel.AllResult;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ApiService {

    //student list
    @GET("verifed-students.php")
    Call<AllStudents> getAllStudentsLists();

    //all notice
    @GET("notice.php")
    Call<AllNotice> getAllNotice();

    //all notice
    @GET("hall-admin.php")
    Call<AllAdmin> getAllAdmin();

    //    get result
//    @GET("individualResult?roll=476734&regulation=2016")
//    Call<AllResult> getAllResult();


    //dynamic url main
    @GET()
    Call<AllResult> getAllResult(@Url String url);

    @GET("meal-coast.php")
    Call<MealList> getMealList();


//    //test
//    @GET()
//    Call<ApiResponse> getAllResult(@Url String url);


    @FormUrlEncoded
    @POST("login.php")
    Call<LoginModel> getLogin(@Field("phone") String phone,
                              @Field("password") String password);

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


