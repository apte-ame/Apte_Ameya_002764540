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
        Person p1 = new Person("Jim","1234",30,"M","H1","abcd","A+");
        Person p2 = new Person("Marcus","123",23,"M","H2","abcd","B+");
        Person p3 = new Person("Tom","123",56,"M","H3","abcd","A-");
        Person p4 = new Person("Jerry","123",37,"F","H4","abcd","O+");
        Person p5 = new Person("Andy","123",60,"M","H5","abcd","A+");
        Person p6 = new Person("John","123",28,"M","H6","abcd","B+");
        Person p7 = new Person("Mary","123",46,"F","H7","abcd","O-");
        Person p8 = new Person("Jenny","123",41,"F","H8","abcd","A+");
        Person p9 = new Person("May","123",26,"F","H9","abcd","A-");
        Person p10 = new Person("Harry","123",52,"M","H10","abcd","B+");
        
        
        personDir.add(p1);
        personDir.add(p2);
        personDir.add(p3);
        personDir.add(p4);
        personDir.add(p5);
        personDir.add(p6);
        personDir.add(p7);
        personDir.add(p8);
        personDir.add(p9);
        personDir.add(p10);
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
