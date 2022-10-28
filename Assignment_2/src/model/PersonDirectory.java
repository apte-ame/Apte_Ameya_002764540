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
public class PersonDirectory {
    private ArrayList<Person> personDir;

    public PersonDirectory() {
        personDir = new ArrayList<Person>();
    }
    
    public ArrayList<Person> createPersonDir(){
        Person p = new Person("Ameya","1234",23,"M","22","abcd","A+");
        personDir.add(p);
        System.out.println(p.getPersonName());
        return personDir;

    }

    public ArrayList<Person> getPersonDir() {
        return personDir;
    }

    public void setPersonDir(ArrayList<Person> personDir) {
        this.personDir = personDir;
    }
    
    public boolean verifyCred(ArrayList<Person> temp,String username,String password){
        boolean flag = false;
        
        for(Person p:temp){
            
            if ((p.getPersonUserId().equals(username)) && (p.getPersonPassword().equals(password))){
                flag = true;           
            }
            else{
                flag = false;                
            }
        }
        return flag;
    }
}
