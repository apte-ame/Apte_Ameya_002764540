/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AMEYA A
 */
public class Patient extends Person{
    private String patientUserId;
    private String patientName;
    private String patientPassword;
    private String bloodGroup;
    private VitalSigns vitalSign;

    public Patient(Person p, VitalSigns vitalSign) {
        patientName = p.getPersonName();
        patientUserId = p.getPersonUserId();
        patientPassword = p.getPersonPassword();
        bloodGroup = p.getBloodGroup();
        this.vitalSign = vitalSign;
    }
    public Patient(){
    
    }
    public String getPatientUserId() {
        return patientUserId;
    }

    public void setPatientUserId(String patientUserId) {
        this.patientUserId = patientUserId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }
    
}
