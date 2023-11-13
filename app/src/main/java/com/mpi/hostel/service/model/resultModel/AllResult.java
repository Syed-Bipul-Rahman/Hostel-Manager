package com.mpi.hostel.service.model.resultModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllResult {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("roll")
    @Expose
    private String roll;
    @SerializedName("instituteData")
    @Expose
    private InstituteData instituteData;
    @SerializedName("regulation")
    @Expose
    private String regulation;
    @SerializedName("resultData")
    @Expose
    private List<ResultDatum> resultData;


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
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

    public List<ResultDatum> getResultData() {
        return resultData;
    }

    public void setResultData(List<ResultDatum> resultData) {
        this.resultData = resultData;
    }
}
