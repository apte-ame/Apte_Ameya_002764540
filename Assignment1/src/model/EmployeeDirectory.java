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
    public ArrayList<Employee> empList;
    public EmployeeDirectory(){
        empList = new ArrayList<>();
    }
    public void addToList(Employee employee){
        empList.add(employee);
        System.out.println(empList.size());
        
        
    }
}
