package com.mpi.hostel.service.model;

import java.util.List;

public class FullResults {

    private boolean success;
    private String time;
    private String roll;
    private InstituteData instituteData;
    private String regulation;
    private List<ResultData> resultData;

    public FullResults(boolean success, String time, String roll, InstituteData instituteData, String regulation, List<ResultData> resultData) {
        this.success = success;
        this.time = time;
        this.roll = roll;
        this.instituteData = instituteData;
        this.regulation = regulation;
        this.resultData = resultData;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public InstituteData getInstituteData() {
        return instituteData;
    }

    public void setInstituteData(InstituteData instituteData) {
        this.instituteData = instituteData;
    }

    public String getRegulation() {
        return regulation;
    }

    public void setRegulation(String regulation) {
        this.regulation = regulation;
    }

    public List<ResultData> getResultData() {
        return resultData;
    }

    public void setResultData(List<ResultData> resultData) {
        this.resultData = resultData;
    }
}
