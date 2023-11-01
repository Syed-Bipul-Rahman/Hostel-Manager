package com.mpi.hostel.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mpi.hostel.databinding.NoticeLayoutBinding;
import com.mpi.hostel.service.model.Notice;
import com.mpi.hostel.view.ui.NoticeDetails;

import java.util.List;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.NoticeViewholder> {
    private Context context;
    private List<Notice> noticeList;

    public NoticeAdapter(Context context, List<Notice> noticeList) {
        this.context = context;
        this.noticeList = noticeList;
    }

    @NonNull
    @Override
    public NoticeAdapter.NoticeViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        NoticeLayoutBinding noticeLayoutBinding = NoticeLayoutBinding.inflate(layoutInflater, parent, false);
        return new NoticeAdapter.NoticeViewholder(noticeLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull NoticeAdapter.NoticeViewholder holder, int position) {

        holder.noticeLayoutBinding.noticeTitle.setText(noticeList.get(position).getNoticetitle());

        //get first 30 charecter
        String showtoDesc = noticeList.get(position).getDescrip().substring(0, Math.min(noticeList.get(position).getDescrip().length(), 30));

        holder.noticeLayoutBinding.noticeDesc.setText(showtoDesc + "...");


        holder.noticeLayoutBinding.noticeContainer.setOnClickListener(v -> {
            Intent intent = new Intent(context, NoticeDetails.class);
            intent.putExtra("title", noticeList.get(position).getNoticetitle());
            intent.putExtra("desc", noticeList.get(position).getDescrip());

            context.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return noticeList.size();
    }

    public class NoticeViewholder extends RecyclerView.ViewHolder {
        NoticeLayoutBinding noticeLayoutBinding;

        public NoticeViewholder(NoticeLayoutBinding noticeLayoutBinding) {
            super(noticeLayoutBinding.getRoot());
            this.noticeLayoutBinding = noticeLayoutBinding;
        }
    }
}
