package com.mpi.hostel.service.model;

import java.util.List;

public class ResultData {
    private PublishedAt publishedAt;
    private int semester;
    private String simpleResult; // For handling simple string result
    private List<SubjectData> passedList; // For handling passed subjects
    private boolean passed;

    public ResultData(PublishedAt publishedAt, int semester, String simpleResult, List<SubjectData> passedList, boolean passed) {
        this.publishedAt = publishedAt;
        this.semester = semester;
        this.simpleResult = simpleResult;
        this.passedList = passedList;
        this.passed = passed;
    }

    public PublishedAt getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(PublishedAt publishedAt) {
        this.publishedAt = publishedAt;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSimpleResult() {
        return simpleResult;
    }

    public void setSimpleResult(String simpleResult) {
        this.simpleResult = simpleResult;
    }

    public List<SubjectData> getPassedList() {
        return passedList;
    }

    public void setPassedList(List<SubjectData> passedList) {
        this.passedList = passedList;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
