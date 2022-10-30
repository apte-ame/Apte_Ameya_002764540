/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AMEYA A
 */
public class VitalSigns {
    private String vitalSignsId;
    private String vitalSign;

    public VitalSigns(String vitalSignsId, String vitalSign) {
        this.vitalSignsId = vitalSignsId;
        this.vitalSign = vitalSign;
    }

    public String getVitalSignsId() {
        return vitalSignsId;
    }

    public void setVitalSignsId(String vitalSignsId) {
        this.vitalSignsId = vitalSignsId;
    }

    public String getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(String vitalSign) {
        this.vitalSign = vitalSign;
    }
    
}
