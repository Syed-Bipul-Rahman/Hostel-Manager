package com.mpi.hostel.service.model.testdata;

public class ResultDatum {
    private ResultUnion result;
    private PublishedAt publishedAt;
    private long semester;
    private boolean passed;

    public ResultUnion getResult() {
        return result;
    }

    public void setResult(ResultUnion value) {
        this.result = value;
    }

    public PublishedAt getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(PublishedAt value) {
        this.publishedAt = value;
    }

    public long getSemester() {
        return semester;
    }

    public void setSemester(long value) {
        this.semester = value;
    }

    public boolean getPassed() {
        return passed;
    }

    public void setPassed(boolean value) {
        this.passed = value;
    }
}
