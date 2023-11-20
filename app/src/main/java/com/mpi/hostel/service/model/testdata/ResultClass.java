package com.mpi.hostel.service.model.testdata;

import java.util.List;

public class ResultClass {
    private List<EdList> failedList;
    private List<EdList> passedList;

    public List<EdList> getFailedList() {
        return failedList;
    }

    public void setFailedList(List<EdList> value) {
        this.failedList = value;
    }

    public List<EdList> getPassedList() {
        return passedList;
    }

    public void setPassedList(List<EdList> value) {
        this.passedList = value;
    }
}
