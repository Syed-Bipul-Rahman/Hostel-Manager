package com.mpi.hostel.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mpi.hostel.R;
import com.mpi.hostel.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);


        //navigate to register page
        binding.register.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
        });


    }
}