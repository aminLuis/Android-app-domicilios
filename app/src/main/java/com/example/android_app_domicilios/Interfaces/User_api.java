package com.example.android_app_domicilios.Interfaces;

import com.example.android_app_domicilios.Models.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface User_api {

   @GET("user/login/{id}")
    public Call<User> find(@Path("id") String id);
}
