package com.mpi.hostel.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mpi.hostel.databinding.ResultRecyclerBinding;
import com.mpi.hostel.service.model.resultModel.ResultDatum;

import java.util.List;

public class StudentResultAdapter extends RecyclerView.Adapter<StudentResultAdapter.resultViewholder> {

    private Context context;
    private List<ResultDatum> resultDataList;

    public StudentResultAdapter(Context context, List<ResultDatum> resultDataList) {
        this.context = context;
        this.resultDataList = resultDataList;
    }


    @NonNull
    @Override
    public StudentResultAdapter.resultViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ResultRecyclerBinding resultRecyclerBinding = ResultRecyclerBinding.inflate(layoutInflater, parent, false);
        return new StudentResultAdapter.resultViewholder(resultRecyclerBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentResultAdapter.resultViewholder holder, int position) {

        String monthNo = resultDataList.get(position).getPublishedAt().getMonth();

        String monthName = "";

        switch (monthNo) {
            case "01":
                monthName = "Jan";
                break;
            case "02":
                monthName = "Feb";
                break;
            case "03":
                monthName = "Mar";
                break;
            case "04":
                monthName = "Apr";
                break;
            case "05":
                monthName = "May";
                break;
            case "06":
                monthName = "Jun";
                break;
            case "07":
                monthName = "Jul";
                break;
            case "08":
                monthName = "Aug";
                break;
            case "09":
                monthName = "Sep";
                break;
            case "10":
                monthName = "Oct";
                break;
            case "11":
                monthName = "Nov";
                break;
            case "12":
                monthName = "Dec";
                break;
            default:
                monthName = "Not Found";
                break;

        }


        holder.resultRecyclerBinding.resultDate.setText(monthName +" "+ resultDataList.get(position).getPublishedAt().getDay() + ", " + resultDataList.get(position).getPublishedAt().getYear());
        holder.resultRecyclerBinding.pointResult.setText(resultDataList.get(position).getResult().toString());
        holder.resultRecyclerBinding.resultSemester.setText(resultDataList.get(position).getSemester().toString() + "th Semester");

    }

    @Override
    public int getItemCount() {
        return resultDataList.size();
    }

    public class resultViewholder extends RecyclerView.ViewHolder {
        ResultRecyclerBinding resultRecyclerBinding;

        public resultViewholder(ResultRecyclerBinding resultRecyclerBinding) {
            super(resultRecyclerBinding.getRoot());
            this.resultRecyclerBinding = resultRecyclerBinding;
        }
    }
}
