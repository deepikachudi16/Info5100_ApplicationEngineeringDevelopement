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
public class EncounterHistory {
    public ArrayList<Encounter> EncounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }

    public EncounterHistory() {
        this.EncounterHistory = new ArrayList<Encounter>();
    }
    
    public void addEncounter(Encounter e ){
        this.EncounterHistory.add(e);
    }

    public int GetSize(){
        return this.EncounterHistory.size();
    }
  
}
