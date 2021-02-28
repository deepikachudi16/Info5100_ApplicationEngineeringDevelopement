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
public class Houses {
    public int housenumber;
   
   public ArrayList<Person> personhou;
 

    
   
   public Houses(){
        
        this.personhou= new ArrayList<Person>();
    }
    public void addPerson(Person pp){
        this.personhou.add(pp);
    
}

    public ArrayList<Person> getPersonhou() {
        return personhou;
    }

    public void setPersonhou(ArrayList<Person> personhou) {
        this.personhou = personhou;
    }
    public int getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }

    
}
