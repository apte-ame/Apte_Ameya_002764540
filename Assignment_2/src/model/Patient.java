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
    
}
