package com.mpi.hostel.service.model;

public class InstituteData {

    private String code;
    private String name;
    private String district;

    public InstituteData(String code, String name, String district) {
        this.code = code;
        this.name = name;
        this.district = district;
    }

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
