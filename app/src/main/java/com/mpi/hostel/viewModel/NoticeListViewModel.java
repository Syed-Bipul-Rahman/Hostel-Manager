package com.mpi.hostel.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mpi.hostel.service.model.Notice;
import com.mpi.hostel.service.repository.AllNoticeRepository;

import java.util.List;

public class NoticeListViewModel extends AndroidViewModel {

    AllNoticeRepository allNoticeRepository;

    public NoticeListViewModel(@NonNull Application application) {
        super(application);
        allNoticeRepository = AllNoticeRepository.getInstance(application);
    }

    public LiveData<List<Notice>> getAllNotice() {
        return allNoticeRepository.getNoticeList();
    }

}
