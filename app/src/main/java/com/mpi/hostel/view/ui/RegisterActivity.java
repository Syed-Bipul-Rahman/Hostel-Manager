package com.mpi.hostel.view.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import com.mpi.hostel.R;
import com.mpi.hostel.databinding.ActivityRegisterBinding;
import com.mpi.hostel.service.model.LoginModel;
import com.mpi.hostel.viewModel.LoginViewModel;
import com.mpi.hostel.viewModel.RegisterUserViewModel;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;
    String name, roll, registration, phone, father, fatherPhone, mother, dist, upazila, session, password;
    private LiveData<LoginModel> registerLiveData;

    RegisterUserViewModel registerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Set the title and messages
        builder.setTitle("Warning")
                .setIcon(R.drawable.ic_round_warning_amber_24)
                .setMessage("Please provide the correct information for registration. This will help the administrator to review your information. Until then, your data won't appear on the student list.")
                .setCancelable(true)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Do something if the user clicks OK
                        dialog.dismiss();
                    }
                });

        AlertDialog alert = builder.create();
        alert.show();

        registerViewModel = new ViewModelProvider(this).get(RegisterUserViewModel.class);
        //register user
        binding.submitdataBtn.setOnClickListener(v -> {
            //get data from edit text

            name = binding.fullName.getText().toString();
            roll = binding.roll.getText().toString();
            registration = binding.registrationNo.getText().toString();
            phone = binding.sdudentphoneNo.getText().toString();
            father = binding.fatherName.getText().toString();
            fatherPhone = binding.fatehrPhoneNo.getText().toString();
            mother = binding.motherName.getText().toString();
            dist = binding.district.getText().toString();
            upazila = binding.upazila.getText().toString();
            session = binding.session.getText().toString();
            password = binding.password.getText().toString();

            //check if any field is empty
            if (name.isEmpty() || roll.isEmpty() || registration.isEmpty() || phone.isEmpty() || father.isEmpty() || fatherPhone.isEmpty() || mother.isEmpty() || dist.isEmpty() || upazila.isEmpty() || session.isEmpty() || password.isEmpty()) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);

                // Set the title and messages
                builder2.setTitle("Warning")
                        .setIcon(R.drawable.ic_round_warning_amber_24)
                        .setMessage("all fields are required")
                        .setCancelable(true)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // Do something if the user clicks OK
                                dialog.dismiss();
                            }
                        });

                AlertDialog alert2 = builder2.create();
                alert2.show();

            } else {
                //register user
                registerLiveData = registerViewModel.registerUser(name, roll, registration, phone, father, fatherPhone, mother, dist, upazila, session, password);
                registerLiveData.observe(this, loginModel -> {
                    if (loginModel != null) {
                        if (loginModel.getStatus().equals("1")) {
                            Toast.makeText(this, "Succefully Registered", Toast.LENGTH_SHORT).show();
                            // Remove the observer after successful login
                            registerLiveData.removeObservers(this);
                            finish();
                        } else if (loginModel.getStatus().equals("0")) {
                            AlertDialog.Builder builder3 = new AlertDialog.Builder(this);

                            // Set the title and messages
                            builder3.setTitle("Warning")
                                    .setIcon(R.drawable.ic_round_warning_amber_24)
                                    .setMessage("Failed to register")
                                    .setCancelable(true)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            // Do something if the user clicks OK
                                            dialog.dismiss();
                                        }
                                    });

                            AlertDialog alert3 = builder3.create();
                            alert3.show();
                        }
                    }
                });
            }
        });


    }
}