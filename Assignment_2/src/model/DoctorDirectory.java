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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDir;
    
    public DoctorDirectory(ArrayList<Doctor> doctorList) {
        this.doctorDir = new ArrayList<Doctor>();
        this.doctorDir = doctorList;
    }

    public DoctorDirectory() {
        
    }

}
