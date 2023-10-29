package com.mpi.hostel.service.model;

public class SubjectData {

    private String subjectCode;
    private String subjectName;
    private String failedType;

    public SubjectData(String subjectCode, String subjectName, String failedType) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.failedType = failedType;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getFailedType() {
        return failedType;
    }

    public void setFailedType(String failedType) {
        this.failedType = failedType;
    }
}
