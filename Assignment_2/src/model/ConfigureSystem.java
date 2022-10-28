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
public class ConfigureSystem {

    public ArrayList<Person> getTemp() {
        return temp;
    }

    public void setTemp(ArrayList<Person> temp) {
        this.temp = temp;
    }
    ArrayList<Person> temp;

    
    
    public ConfigureSystem() {
        PersonDirectory pDir = new PersonDirectory();
        temp = pDir.createPersonDir();
    }
   
}
