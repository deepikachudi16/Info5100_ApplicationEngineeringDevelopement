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
public class Patient extends Person{
   
    
    public EncounterHistory encphistory;

   
           
    public Patient(Person p){
        this.firstname = p.firstname;
        this.lastname = p.lastname;
        this.personid = p.personid;
        encphistory = new EncounterHistory();
}

    public EncounterHistory getEncphistory() {
        return encphistory;
    }

    public void setEncphistory(EncounterHistory encphistory) {
        this.encphistory = encphistory;
    }
   
    
    public boolean isPatientNormal(){
        Encounter encp= this.encphistory.getEncounterHistory().get(this.encphistory.GetSize()-1);
        VitalSigns vits=encp.getVittysigns();
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
    
}




    
    
    
