package com.mpi.hostel.service.model.resultModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultDatum {

    @SerializedName("publishedAt")
    @Expose
    private PublishedAt publishedAt;
    @SerializedName("semester")
    @Expose
    private Integer semester;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("passed")
    @Expose
    private Boolean passed;

    public PublishedAt getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(PublishedAt publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Boolean getPassed() {
        return passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }
}
