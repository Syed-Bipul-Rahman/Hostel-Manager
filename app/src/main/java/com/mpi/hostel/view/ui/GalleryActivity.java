package com.mpi.hostel.view.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.mpi.hostel.R;
import com.mpi.hostel.databinding.ActivityGalleryBinding;
import com.mpi.hostel.service.model.GalleryModel;
import com.mpi.hostel.view.adapter.GalleryAdapter;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    ActivityGalleryBinding binding;
    List<GalleryModel> imageGallery;
    GalleryAdapter galleryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGalleryBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().hide();


        //image gallery
        imageGallery = new ArrayList<>();
        binding.rvGallery.setLayoutManager(new GridLayoutManager(this,2));
        galleryAdapter = new GalleryAdapter(this, imageGallery);
        binding.rvGallery.setAdapter(galleryAdapter);
//slider
        ImageSlider imageSlider = binding.imgSlid;

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.imageone, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.imagetwo, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.a, ScaleTypes.CENTER_CROP));


        imageSlider.setImageList(imageList);


        imageGallery.add(new GalleryModel(R.drawable.imageone));
        imageGallery.add(new GalleryModel(R.drawable.a));
        imageGallery.add(new GalleryModel(R.drawable.imageone));
        imageGallery.add(new GalleryModel(R.drawable.imageone));
        imageGallery.add(new GalleryModel(R.drawable.a));
        imageGallery.add(new GalleryModel(R.drawable.imageone));
        imageGallery.add(new GalleryModel(R.drawable.imageone));
        imageGallery.add(new GalleryModel(R.drawable.a));
        imageGallery.add(new GalleryModel(R.drawable.imageone));

        galleryAdapter.notifyDataSetChanged();

    }
}