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
public class Patient {
    private int patientid;
    private String firstname;
    private String lastname;
   
    
    public ArrayList<VitalSigns> alldetails;

    public ArrayList<VitalSigns> getAlldetails() {
        return alldetails;
    }

    public void setAlldetails(ArrayList<VitalSigns> alldetails) {
        this.alldetails = alldetails;
    }

    public VitalSigns getCurrentvit() {
        return currentvit;
    }

    public void setCurrentvit(VitalSigns currentvit) {
        this.currentvit = currentvit;
    }
    public ArrayList<Patient> patienthistory;
    public VitalSigns currentvit;
           
    public Patient(){
        alldetails = new ArrayList<VitalSigns>();
}
   
    public String getFirstname() {
        return firstname;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
   
    
    public boolean isPatientNormal(VitalSigns vits){
        double respiratoryrate=vits.getRespiratoryrate();
        int bloodpressure=vits.getBloodpressure();
        int heartrate=vits.getHeartrate();
        double weightkgs=vits.getWeightkgs();
        
        int age= vits.getAgegroup();
        
        switch(age){
            case 1:
                if(respiratoryrate>=30 && respiratoryrate<=50 && heartrate>=120 && heartrate<=160 && bloodpressure>=50 && bloodpressure<=70 && weightkgs>=2 && weightkgs<=3){
                    System.out.println(""+firstname+" is normal");
                    return true;
                }
                else{
                    System.out.println(""+firstname+ " needs help!!");
                    return false;
                }
            
            
            
            case 2:
                if(respiratoryrate>=20 && respiratoryrate<=30 && heartrate>=80 && heartrate<=140 && bloodpressure>=70 && bloodpressure<=100 && weightkgs>=4 && weightkgs<=10){
                    System.out.println(""+firstname+" is normal");
                    return true;
                }
                else{
                    System.out.println(""+firstname+ " needs help!!");
                    return false;
                }
            
            case 3:
                if(respiratoryrate>=20 && respiratoryrate<=30 && heartrate>=80 && heartrate<=130 && bloodpressure>=80 && bloodpressure<=110 && weightkgs>=10 && weightkgs<=14){
                    System.out.println(""+firstname+" is normal");
                    return true;
                }
                else{
                    System.out.println(""+firstname+ " needs help!!");
                    return false;
                }
            
            case 4:
                if(respiratoryrate>=20 && respiratoryrate<=30 && heartrate>=80 && heartrate<=120 && bloodpressure>=80 && bloodpressure<=110 && weightkgs>=14 && weightkgs<=18){
                    System.out.println(""+firstname+" is normal");
                    return true;
                }
                else{
                    System.out.println(""+firstname+ " needs help!!");
                    return false;
                }
            case 5:
                if(respiratoryrate>=20 && respiratoryrate<=30 && heartrate>=70 && heartrate<=110 && bloodpressure>=80 && bloodpressure<=120 && weightkgs>=20 && weightkgs<=42){
                    System.out.println(""+firstname+" is normal");
                    return true;
                }
                else{
                    System.out.println(""+firstname+ " needs help!!");
                    return false;
                }
            case 6:
                if(respiratoryrate>=12 && respiratoryrate<=20 && heartrate>=55 && heartrate<=105 && bloodpressure>=110 && bloodpressure<=120 && weightkgs>50){
                    System.out.println(""+firstname+" is normal");
                    return true;
                }
                else{
                    System.out.println(""+firstname+ " needs help!!");
                    return false;
                }
            default:
                System.out.println("Invalid input");
                break;
            
        }
        return false;
    }

    void addPatientVital(VitalSigns vitals) {
        if(currentvit== null){
            currentvit = vitals;
            
        }else{
            this.alldetails.add(currentvit);
            this.currentvit=vitals;
            
        }
        
    }

    void addPatientDetails(VitalSigns vits) {
       
    }

    
}




    
    
    
