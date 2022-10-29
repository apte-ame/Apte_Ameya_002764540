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
public class PatientDirectory {
    private ArrayList<Patient> patientDir;
        public PatientDirectory(ArrayList<Patient> patList) {
        this.patientDir = new ArrayList<Patient>();
        this.patientDir = patList;
    }

    public PatientDirectory() {
        
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }

}
