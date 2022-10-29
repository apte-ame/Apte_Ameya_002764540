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
public class City {
    private ArrayList<Hospital> hospList;
    private ArrayList<Community> commList;
    private String cityName;
    private String cityId;

    public City(ArrayList<Hospital> hospList, ArrayList<Community> commList, String cityName, String cityId) {
        this.hospList = new ArrayList<Hospital>();
        this.commList = new ArrayList<Community>();
        this.hospList = hospList;
        this.commList = commList;
        this.cityName = cityName;
        this.cityId = cityId;
    }

    public City() {

    }

    public ArrayList<Hospital> getHospList() {
        return hospList;
    }

    public void setHospList(ArrayList<Hospital> hospList) {
        this.hospList = hospList;
    }



    public ArrayList<Community> getCommList() {
        return commList;
    }

    public void setCommList(ArrayList<Community> commList) {
        this.commList = commList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    
}
