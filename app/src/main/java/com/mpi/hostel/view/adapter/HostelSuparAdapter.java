package com.mpi.hostel.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mpi.hostel.databinding.AdminRecyclerLayoutBinding;
import com.mpi.hostel.service.model.SingleAdmin;

import java.util.List;

public class HostelSuparAdapter extends RecyclerView.Adapter<HostelSuparAdapter.HostelViewholder> {

    Context context;
    List<SingleAdmin> singleAdminList;

    public HostelSuparAdapter(Context context, List<SingleAdmin> singleAdminList) {
        this.context = context;
        this.singleAdminList = singleAdminList;
    }


    @NonNull
    @Override
    public HostelSuparAdapter.HostelViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        AdminRecyclerLayoutBinding adminRecyclerLayoutBinding = AdminRecyclerLayoutBinding.inflate(layoutInflater, parent, false);
        return new HostelSuparAdapter.HostelViewholder(adminRecyclerLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull HostelSuparAdapter.HostelViewholder holder, int position) {
        holder.adminRecyclerLayoutBinding.hostelSuparName.setText(singleAdminList.get(position).getHallSuparName());
        holder.adminRecyclerLayoutBinding.hostelSuparPhone.setText(singleAdminList.get(position).getHallSuparPhone());
    }

    @Override
    public int getItemCount() {
        return singleAdminList.size();
    }

    public class HostelViewholder extends RecyclerView.ViewHolder {
        AdminRecyclerLayoutBinding adminRecyclerLayoutBinding;

        public HostelViewholder(AdminRecyclerLayoutBinding adminRecyclerLayoutBinding) {
            super(adminRecyclerLayoutBinding.getRoot());

            this.adminRecyclerLayoutBinding = adminRecyclerLayoutBinding;
        }
    }
}
