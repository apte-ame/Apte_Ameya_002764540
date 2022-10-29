/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AMEYA A
 */
public class CommunityAdmin extends Person{
    String communityUserId;
    String communityPassword;

    public CommunityAdmin(String communityUserId, String communityPassword) {
        this.communityUserId = communityUserId;
        this.communityPassword = communityPassword;
    }

    public String getCommunityUserId() {
        return communityUserId;
    }

    public void setCommunityUserId(String communityUserId) {
        this.communityUserId = communityUserId;
    }

    public String getCommunityPassword() {
        return communityPassword;
    }

    public void setCommunityPassword(String communityPassword) {
        this.communityPassword = communityPassword;
    }
    
}
