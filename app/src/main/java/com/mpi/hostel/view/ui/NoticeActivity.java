package com.mpi.hostel.view.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mpi.hostel.databinding.ActivityNoticeBinding;
import com.mpi.hostel.service.model.Notice;
import com.mpi.hostel.view.adapter.NoticeAdapter;
import com.mpi.hostel.viewModel.NoticeListViewModel;

import java.util.List;

public class NoticeActivity extends AppCompatActivity {
    ActivityNoticeBinding binding;
    NoticeListViewModel noticeListViewModel;
    NoticeAdapter noticeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNoticeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setTitle("Notice");


        binding.noticeRecycler.setLayoutManager(new LinearLayoutManager(this));


        noticeListViewModel = new ViewModelProvider(this).get(NoticeListViewModel.class);
        noticeListViewModel.getAllNotice().observe(this, new Observer<List<Notice>>() {
            @Override
            public void onChanged(List<Notice> notices) {


                binding.progressbarnotice.setVisibility(View.GONE);

                noticeAdapter = new NoticeAdapter(NoticeActivity.this, notices);
                binding.noticeRecycler.setAdapter(noticeAdapter);

                binding.noticeRecycler.setVisibility(View.VISIBLE);


            }
        });


    }
}