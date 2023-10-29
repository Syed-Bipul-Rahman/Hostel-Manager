package com.mpi.hostel.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mpi.hostel.databinding.StudenRecyclerLayoutBinding;
import com.mpi.hostel.service.model.Students;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentViewHolder> {

    private Context context;
    private List<Students> results;

    public StudentsAdapter(Context context, List<Students> results) {
        this.context = context;
        this.results = results;
    }


    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        StudenRecyclerLayoutBinding studenRecyclerLayoutBinding = StudenRecyclerLayoutBinding.inflate(layoutInflater, parent, false);
        return new StudentViewHolder(studenRecyclerLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsAdapter.StudentViewHolder holder, int position) {

        holder.studenRecyclerLayoutBinding.studentname.setText(results.get(position).getName());
        holder.studenRecyclerLayoutBinding.studentphone.setText(results.get(position).getPhone());

    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {

        StudenRecyclerLayoutBinding studenRecyclerLayoutBinding;

        public StudentViewHolder(StudenRecyclerLayoutBinding studenRecyclerLayoutBinding) {
            super(studenRecyclerLayoutBinding.getRoot());


            this.studenRecyclerLayoutBinding = studenRecyclerLayoutBinding;
        }
    }
}
