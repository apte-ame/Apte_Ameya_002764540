/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author AMEYA A
 */
public class Hospital {
    private String hospitalName;
    private String hospitalId;
    private Doctor doctor;

    public Hospital(String hospitalName, String hospitalId, Doctor doctor) {
        this.hospitalName = hospitalName;
        this.hospitalId = hospitalId;
        this.doctor = doctor;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    
    
}
