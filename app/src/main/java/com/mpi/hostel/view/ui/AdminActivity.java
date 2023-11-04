package com.mpi.hostel.view.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mpi.hostel.databinding.ActivityAdminBinding;
import com.mpi.hostel.service.model.SingleAdmin;
import com.mpi.hostel.view.adapter.HostelSuparAdapter;
import com.mpi.hostel.viewModel.AdminListViewModel;

import java.util.List;

public class AdminActivity extends AppCompatActivity {
    ActivityAdminBinding binding;
    HostelSuparAdapter adapter;
    List<SingleAdmin> mymodelList;
    AdminListViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAdminBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setContentView(view);


        setTitle("Admin List");

        binding.rvAdmin.setLayoutManager(new LinearLayoutManager(this));

        viewModel = new ViewModelProvider(this).get(AdminListViewModel.class);
        viewModel.getAllAdmin().observe(this, singleAdmins -> {
            mymodelList = singleAdmins;
            binding.progressBar.setVisibility(View.GONE);
            adapter = new HostelSuparAdapter(AdminActivity.this, singleAdmins);
            binding.rvAdmin.setAdapter(adapter);
            binding.rvAdmin.setVisibility(View.VISIBLE);

            adapter.notifyDataSetChanged();
        });


    }
}