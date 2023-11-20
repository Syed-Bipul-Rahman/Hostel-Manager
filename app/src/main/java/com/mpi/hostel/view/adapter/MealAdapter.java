package com.mpi.hostel.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mpi.hostel.databinding.MealcostListLayoutBinding;
import com.mpi.hostel.service.model.MealData;

import java.util.List;

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.MealViewHolder> {
    private Context context;
    private List<MealData> mealDataList;

    public MealAdapter(Context context, List<MealData> noticeList) {
        this.context = context;
        this.mealDataList = noticeList;
    }

    @NonNull
    @Override
    public MealAdapter.MealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MealcostListLayoutBinding mealcostListLayoutBinding = MealcostListLayoutBinding.inflate(layoutInflater, parent, false);
        return new MealAdapter.MealViewHolder(mealcostListLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MealViewHolder holder, int position) {
        holder.mealcostListLayoutBinding.coastDate.setText(mealDataList.get(position).getDate());
        holder.mealcostListLayoutBinding.costTaka.setText(mealDataList.get(position).getCost());

    }


    @Override
    public int getItemCount() {
        return mealDataList.size();
    }

    public class MealViewHolder extends RecyclerView.ViewHolder {
        MealcostListLayoutBinding mealcostListLayoutBinding;

        public MealViewHolder(MealcostListLayoutBinding mealcostListLayoutBinding) {
            super(mealcostListLayoutBinding.getRoot());
            this.mealcostListLayoutBinding = mealcostListLayoutBinding;
        }
    }
}
