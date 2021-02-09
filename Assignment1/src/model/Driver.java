/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;

/**
 *
 * @author Deepika Reddy
 */
public class Driver {
    private String license;
    private String dateofissue;
    private String dateofexpiration;
    private String bloodtype;
    private Image picture;

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(String dateofissue) {
        this.dateofissue = dateofissue;
    }

    public String getDateofexpiration() {
        return dateofexpiration;
    }

    public void setDateofexpiration(String dateofexpiration) {
        this.dateofexpiration = dateofexpiration;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }
    
    
}
