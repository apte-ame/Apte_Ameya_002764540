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
        Person p1 = new Person("Jim","123",30,"M","H1","abcd","A+","9820993611","xyz@gmail.com");
        Person p2 = new Person("Marcus","456",23,"M","H2","bbbb","B+","9820993612","abc@gmail.com");
        Person p3 = new Person("Tom","789",56,"M","H3","cccc","A-","9820993613","aaa@gmail.com");
        Person p4 = new Person("Jerry","000",37,"F","H4","dddd","O+","9820993614","bbb@gmail.com");
        Person p5 = new Person("Andy","111",60,"M","H5","eeee","A+","9820993615","ccc@gmail.com");
        Person p6 = new Person("John","222",28,"M","H6","ffff","B+","9820993616","ddd@gmail.com");
        Person p7 = new Person("Mary","333",46,"F","H7","gggg","O-","9820993617","eee@gmail.com");
        Person p8 = new Person("Jenny","444",41,"F","H8","hhhh","A+","9820993618","fff@gmail.com");
        Person p9 = new Person("May","555",26,"F","H9","aaaa","A-","9820993619","ggg@gmail.com");
        Person p10 = new Person("Harry","666",52,"M","H10","efgh","B+","9820993610","hhh@gmail.com");
        
        
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
