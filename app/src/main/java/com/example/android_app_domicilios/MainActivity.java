package com.example.android_app_domicilios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.android_app_domicilios.Interfaces.User_api;
import com.example.android_app_domicilios.Models.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText txt_user, txt_password;

    private void iniciar(){
        txt_user = findViewById(R.id.txt_user);
        txt_password = findViewById(R.id.txt_password);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar();
    }

    private void buscar_user(String id){

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://127.0.0.1:3000").addConverterFactory(GsonConverterFactory.create()).build();

        User_api user = retrofit.create(User_api.class);
        Call<User> call = user.find(id);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });

    }

}