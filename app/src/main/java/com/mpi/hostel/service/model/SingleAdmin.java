package com.mpi.hostel.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SingleAdmin {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("hall_supar_name")
    @Expose
    private String hallSuparName;
    @SerializedName("hall_supar_phone")
    @Expose
    private String hallSuparPhone;
    @SerializedName("assistent_hall_supar")
    @Expose
    private String assistentHallSupar;
    @SerializedName("assistent_hall_supar_phone")
    @Expose
    private String assistentHallSuparPhone;
    @SerializedName("office_assistent")
    @Expose
    private String officeAssistent;
    @SerializedName("office_assitent_phone")
    @Expose
    private String officeAssitentPhone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHallSuparName() {
        return hallSuparName;
    }

    public void setHallSuparName(String hallSuparName) {
        this.hallSuparName = hallSuparName;
    }

    public String getHallSuparPhone() {
        return hallSuparPhone;
    }

    public void setHallSuparPhone(String hallSuparPhone) {
        this.hallSuparPhone = hallSuparPhone;
    }

    public String getAssistentHallSupar() {
        return assistentHallSupar;
    }

    public void setAssistentHallSupar(String assistentHallSupar) {
        this.assistentHallSupar = assistentHallSupar;
    }

    public String getAssistentHallSuparPhone() {
        return assistentHallSuparPhone;
    }

    public void setAssistentHallSuparPhone(String assistentHallSuparPhone) {
        this.assistentHallSuparPhone = assistentHallSuparPhone;
    }

    public String getOfficeAssistent() {
        return officeAssistent;
    }

    public void setOfficeAssistent(String officeAssistent) {
        this.officeAssistent = officeAssistent;
    }

    public String getOfficeAssitentPhone() {
        return officeAssitentPhone;
    }

    public void setOfficeAssitentPhone(String officeAssitentPhone) {
        this.officeAssitentPhone = officeAssitentPhone;
    }
}
