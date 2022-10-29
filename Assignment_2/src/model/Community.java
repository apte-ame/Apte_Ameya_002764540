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
public class Community {
    private ArrayList<House> houseList = new ArrayList<House>();
    private String communityName;
    private ArrayList<Hospital> hosp = new ArrayList<Hospital>();
    private String communityId;

    public Community(ArrayList<House> houseList, String communityName, ArrayList<Hospital> hosp, String communityId) {
        
        this.houseList = houseList;
        this.communityName = communityName;
        this.hosp = hosp;
        this.communityId = communityId;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<Hospital> getHosp() {
        return hosp;
    }

    public void setHosp(ArrayList<Hospital> hosp) {
        this.hosp = hosp;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
    
}
