package com.mpi.hostel.service.model.testdata;

import java.util.List;

public class ApiResponse {
    private boolean success;
    private String time;
    private String roll;
    private InstituteData instituteData;
    private String regulation;
    private List<ResultDatas> resultData;

    // Getters and setters


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

    public List<ResultDatas> getResultData() {
        return resultData;
    }

    public void setResultData(List<ResultDatas> resultData) {
        this.resultData = resultData;
    }

    public static class InstituteData {
        private String code;
        private String name;
        private String district;

        // Getters and setters

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }
    }

    public static class ResultDatas {
        private PublishedAt publishedAt;
        private int semester;
        private Result result;
        private boolean passed;

        // Getters and setters

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

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public boolean isPassed() {
            return passed;
        }

        public void setPassed(boolean passed) {
            this.passed = passed;
        }
    }

    public static class PublishedAt {
        private String day;
        private String month;
        private String year;

        // Getters and setters


        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }
    }

    public static class Result {
        private List<FailedSubject> failedList;
        private List<PassedSubject> passedList;
        private String resultString; // Rename this field
        private Result resultObject; // Add this field

        // Getters and setters

        public List<FailedSubject> getFailedList() {
            return failedList;
        }

        public void setFailedList(List<FailedSubject> failedList) {
            this.failedList = failedList;
        }

        public List<PassedSubject> getPassedList() {
            return passedList;
        }

        public void setPassedList(List<PassedSubject> passedList) {
            this.passedList = passedList;
        }

        public String getResultString() {
            return resultString;
        }

        public void setResultString(String resultString) {
            this.resultString = resultString;
        }

        public Result getResultObject() {
            return resultObject;
        }

        public void setResultObject(Result resultObject) {
            this.resultObject = resultObject;
        }
    }

    public static class FailedSubject {
        private String subjectCode;
        private String subjectName;
        private String failedType;

        // Getters and setters


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

    public static class PassedSubject {
        private String subjectCode;
        private String subjectName;
        private String failedType;

        // Getters and setters


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
}