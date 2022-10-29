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
public class MasterDBDirectory {
    ArrayList<MasterDB> masterDir;

    public MasterDBDirectory() {
        masterDir = new ArrayList<MasterDB>();
    }
    
    public MasterDBDirectory(ArrayList<MasterDB> masterDir){
        this.masterDir = new ArrayList<MasterDB>();
        this.masterDir = masterDir;
    }
    
}
