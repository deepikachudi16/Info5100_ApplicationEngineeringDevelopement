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
public class City {
    public String city;
   public ArrayList<Community> comm ;
   
    public City(){
        this.comm = new ArrayList<Community>();
        
    }
    
    public ArrayList<Community> Getcomm(){
        return this.comm;
    }
    
    public void addCommunity(Community ec){
        this.comm.add(ec);
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
