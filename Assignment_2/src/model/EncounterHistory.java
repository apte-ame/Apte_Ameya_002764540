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
public class EncounterHistory {
    private ArrayList<Encounter> encounterHis;

    public EncounterHistory(ArrayList<Encounter> encounterHis) {
        this.encounterHis = encounterHis;
    }

    public ArrayList<Encounter> getEncounterHis() {
        return encounterHis;
    }

    public void setEncounterHis(ArrayList<Encounter> encounterHis) {
        this.encounterHis = encounterHis;
    }
    
    
}
