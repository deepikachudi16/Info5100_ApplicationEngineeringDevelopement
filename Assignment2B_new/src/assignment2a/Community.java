/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2a;

import java.util.ArrayList;

/**
 *
 * @author Deepika Reddy
 */
public class Community {
    public String community;

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public ArrayList<Houses> comhouses;

    public Community() {
        
        this.comhouses = new ArrayList<Houses>();
    }
    public void addHouse(Houses hh){
        this.comhouses.add(hh);
        
    }
    
    public ArrayList<Houses> getComhouses() {
        return comhouses;
    }

    public void setComhouses(ArrayList<Houses> comhouses) {
        this.comhouses = comhouses;
    }
    
}
