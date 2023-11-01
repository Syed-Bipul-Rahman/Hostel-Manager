package com.mpi.hostel.view.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.mpi.hostel.R;
import com.mpi.hostel.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;

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


    }
}