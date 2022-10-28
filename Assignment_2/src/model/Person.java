/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AMEYA A
 */
public class Person {
    private String personName;
    private String personUserId;
    private int personAge;
    private String personGender;
    private String houseId;
    private String personPassword;
    private String bloodGroup;

    public Person() {
    }

    
    public Person(String personName, String personUserId, int personAge, String personGender, String houseId, String personPassword, String bloodGroup) {
        this.personName = personName;
        this.personUserId = personUserId;
        this.personAge = personAge;
        this.personGender = personGender;
        this.houseId = houseId;
        this.personPassword = personPassword;
        this.bloodGroup = bloodGroup;
    }
    


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonUserId() {
        return personUserId;
    }

    public void setPersonUserId(String personUserId) {
        this.personUserId = personUserId;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getPersonPassword() {
        return personPassword;
    }

    public void setPersonPassword(String personPassword) {
        this.personPassword = personPassword;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
