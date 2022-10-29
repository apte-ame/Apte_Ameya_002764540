/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AMEYA A
 */
public class MasterDB {
    City c;
    Hospital h;
    Doctor d;
    Community com;

    public MasterDB(City c, Hospital h, Doctor d, Community com) {
        this.c = c;
        this.h = h;
        this.d = d;
        this.com = com;
    }

    public City getC() {
        return c;
    }

    public void setC(City c) {
        this.c = c;
    }

    public Hospital getH() {
        return h;
    }

    public void setH(Hospital h) {
        this.h = h;
    }

    public Doctor getD() {
        return d;
    }

    public void setD(Doctor d) {
        this.d = d;
    }

    public Community getCom() {
        return com;
    }

    public void setCom(Community com) {
        this.com = com;
    }

    
}
