package com.mpi.hostel.view.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.R;

public class SplashScreenActivity extends AppCompatActivity {
    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));

        Thread thread = new Thread() {
            public void run() {
                try {

                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    //if already login or not

                    //check user is already login or not
                    SharedPreferences sharedPreferences = getSharedPreferences("login_pref", MODE_PRIVATE);
                    String storedUserName = sharedPreferences.getString("USER_NAME", "");

                    if (!storedUserName.isEmpty())
                        startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                    else {
                        startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
                    }

                    finish();
                }
            }
        };
        thread.start();


    }
}