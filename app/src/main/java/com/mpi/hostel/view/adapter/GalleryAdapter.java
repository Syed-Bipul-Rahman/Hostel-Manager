package com.mpi.hostel.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mpi.hostel.databinding.GalleryImageBinding;
import com.mpi.hostel.service.model.GalleryModel;
import com.mpi.hostel.view.ui.FullImageActivity;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder> {

    private Context context;
    private List<GalleryModel> galleryModels;

    public GalleryAdapter(Context context, List<GalleryModel> galleryModels) {
        this.context = context;
        this.galleryModels = galleryModels;
    }

    @NonNull
    @Override
    public GalleryAdapter.GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        GalleryImageBinding galleryImageBinding = GalleryImageBinding.inflate(layoutInflater, parent, false);
        return new GalleryAdapter.GalleryViewHolder(galleryImageBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryAdapter.GalleryViewHolder holder, int position) {
        holder.galleryImageBinding.galleryimageitem.setImageResource(galleryModels.get(position).getImage());
        //onclick navigate to fullimage activity with image

        holder.galleryImageBinding.galleryimageitem.setOnClickListener(v -> {
            Intent intent = new Intent(context, FullImageActivity.class);
            intent.putExtra("imageId", galleryModels.get(position).getImage());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return galleryModels.size();
    }

    public class GalleryViewHolder extends RecyclerView.ViewHolder {
        GalleryImageBinding galleryImageBinding;

        public GalleryViewHolder(GalleryImageBinding galleryImageBinding) {
            super(galleryImageBinding.getRoot());

            this.galleryImageBinding = galleryImageBinding;

        }
    }
}
