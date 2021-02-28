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
public class PatientDirectory {
    private ArrayList <Patient> PatientDir;

    public PatientDirectory() {
        this.PatientDir = new ArrayList<>();
    }

    public ArrayList<Patient> getPatient() {
        return PatientDir;
    }

    public void setPatient(ArrayList<Patient> Patient) {
        this.PatientDir = Patient;
    }
    
    public Patient GetPatientById(int id){
        Patient pat = null;
        for(Patient p: this.PatientDir){
            if(p.getPersonid() == id){
                pat=p;
            }
        }
        return pat;
    }

    public void addPerson(Patient perpichi){
        this.PatientDir.add(perpichi);
    }

    
    
    
}
