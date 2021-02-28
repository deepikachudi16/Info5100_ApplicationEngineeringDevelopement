
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2a;

/**
 *
 * @author Deepika Reddy
 */
public class Encounter {
    
    public String timestamp;
    public VitalSigns vittysigns;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public VitalSigns getVittysigns() {
        return vittysigns;
    }

    public void setVittysigns(VitalSigns vittysigns) {
        this.vittysigns = vittysigns;
    }
    
    
}
