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
public class EmployeeDirectory {
    private ArrayList<Employee> empDir;

    public ArrayList<Employee> getEmpDir() {
        return empDir;
    }

    public void setEmpDir(ArrayList<Employee> empDir) {
        this.empDir = empDir;
    }
    
    public EmployeeDirectory(){
        empDir = new ArrayList<>();
    }
    public Employee addToEmpDir(){
        Employee newEmp = new Employee();
        empDir.add(newEmp);
        return newEmp;
    }

    public void deleteFromDir(Employee emp) {
        empDir.remove(emp);
    }
    
    public ArrayList<Employee> searchByField(String fieldFlag, String field){
        ArrayList<Employee> empDirTemp = new ArrayList<>();
        
        switch(fieldFlag){
            case "NAME":
                for(Employee emp:empDir){
                   if(emp.getName().equals(field)){ // this if is to safegaurd that it checks only that particular field
                       empDirTemp.add(emp);
                   }
                }
                break;
            case "EMP_ID":
                for(Employee emp:empDir){
                   if(emp.getEmployeeId().equals(field)){ 
                       empDirTemp.add(emp);
                   }
                }
                break;
            case "AGE":
                for(Employee emp:empDir){
                   if(emp.getAge() == Integer.parseInt(field)){ 
                       empDirTemp.add(emp);
                   }
                }
                break;
        }
        return empDirTemp;
    }
}
