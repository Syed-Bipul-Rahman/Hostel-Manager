package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import com.mpi.hostel.databinding.ActivityLoginBinding;
import com.mpi.hostel.service.model.LoginModel;
import com.mpi.hostel.viewModel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    private LoginViewModel loginViewModel;
    private LiveData<LoginModel> loginLiveData;


    private SharedPreferences sharedPreferences;
    private static final String PREF_NAME = "login_pref";
    private static final String IS_LOGGED_IN = "is_logged_in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        setTitle("Login");

        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        binding.login.setOnClickListener(v -> {
            String username = binding.username.getText().toString();
            String password = binding.password.getText().toString();
            binding.loading.setVisibility(View.VISIBLE);
            loginLiveData = loginViewModel.loginUser(username, password);
            loginLiveData.observe(this, loginModel -> {
                if (loginModel != null) {
                    if (loginModel.getStatus().equals("1")) {
                        binding.loading.setVisibility(View.GONE);

                        sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean(IS_LOGGED_IN, true);
                        editor.apply();

                        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                        // Remove the observer after successful login
                        loginLiveData.removeObservers(this);
                        finish();
                    } else if (loginModel.getStatus().equals("0")) {
                        binding.loading.setVisibility(View.GONE);
                        binding.seterror.setVisibility(View.VISIBLE);
                    }
                } else {
                    Toast.makeText(this, "something went wrong", Toast.LENGTH_SHORT).show();
                    // Handle other cases like null response or errors from the login attempt
                }
            });
        });

        binding.register.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
        });
    }
}