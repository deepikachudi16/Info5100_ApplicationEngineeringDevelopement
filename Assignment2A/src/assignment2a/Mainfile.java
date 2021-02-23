/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2a;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Deepika Reddy
 */

public class Mainfile {
    
    public static Patient GetPatientDetails(ArrayList<Patient> patientdata, int patientid){
        Patient pat= null;
        for(int i=0; i<patientdata.size(); i++)
        {
            if(patientdata.get(i).getPatientid()== patientid){
                pat=patientdata.get(i);
            }
        } return pat;
    }
   
    public static void main(String[] args)
    {
        ArrayList<Patient> patientdata = new ArrayList<Patient>(); 
        boolean isNormal=false;
        boolean isVitalNormal=false;
        
        System.out.println("--------------------------");
        System.out.println("------MEDICAL RECORD------");
        System.out.println("--------------------------");
        
     while(true){
         
        System.out.println("Choose Options\n"
                + "1. Add Detials \n"
                + "2. View Details \n"
                + "3. Exit\n");
     Scanner sc= new Scanner(System.in);
     int menuoption = sc.nextInt();
     
     switch(menuoption){
         case 1:
             VitalSigns vits= new VitalSigns();
             Patient p= new Patient();
             System.out.println("Enter Details");
              System.out.println("Enter Patient ID:");
             int patientid=sc.nextInt();
             Patient presentpatient= GetPatientDetails(patientdata, patientid);
             Patient newPatient;
             if(presentpatient == null)
             {
                    p.setPatientid(patientid);
                    System.out.println("Enter First Name:");
                    String firstname=sc.next();
                    p.setFirstname(firstname);
                    System.out.println("Enter Last Name:");
                    String lastname=sc.next();
                    p.setLastname(lastname);
                    
                   
                   newPatient = new Patient();
                   newPatient.setFirstname(firstname);
                   newPatient.setLastname(lastname);
                   newPatient.setPatientid(patientid);
                   patientdata.add(newPatient);
             }
             else{
                 newPatient = presentpatient;
             }

            
             //System.out.println("Enter Age:");
             //int age=sc.nextInt();
             //p.setAge(age
             
            
             System.out.println("Enter Respiratory rate");
             Double respiratoryrate= sc.nextDouble();
             vits.setRespiratoryrate(respiratoryrate);
             
             System.out.println("Enter Heart rate");
             int heartrate=sc.nextInt();
             vits.setHeartrate(heartrate);
             System.out.println("Enter Blood Pressure");
             int bloodpressure=sc.nextInt();
             vits.setBloodpressure(bloodpressure);
             System.out.println("Enter Weight in kgs");
             double weightkgs=sc.nextDouble();
             vits.setWeightkgs(weightkgs);
             System.out.println("Enter your age group");
                    System.out.println("1. Newborn \n"
                           + "2.Infants(1-12 months)\n"
                           + "3. Toddler(1-3 yrs) \n"
                           + "4.Preschoolar(3-5 yrs) \n"
                           + "5. SchoolAge(6-12 yrs)\n"
                           + "6.Adolescent(13+ yrs)");
                   int agegroup=sc.nextInt();
            //System.out.println("Enter Weight in pounds");
            //double weightpounds=sc.nextDouble();
            //vs.setWeightpounds(weightpounds);
             
            
            vits.setAgegroup(agegroup);
           
            isNormal= p.isPatientNormal(vits);
             newPatient.addPatientVital(vits);
          
             System.out.println("To check whether Vital sign is normal or not");
             System.out.println("1. Respiratoryrate\n"
                     + "2.Heartrate\n"
                     + "3.Bloodpressure\n"
                     + "4.Weight\n");
             int vitalgroup=sc.nextInt();
             vits.setVitalgroup(vitalgroup);
   
             isVitalNormal=vits.isVitalSignNormal(vitalgroup, agegroup);
           
            break;
         
         case 2:
             
             System.out.println("------Patient Details------");
             for(Patient pat: patientdata){
                 System.out.println("Name of the patient is:" + pat.getFirstname()+" " + pat.getLastname());
                 System.out.println("Patient ID:" + pat.getPatientid());
                 
                 System.out.println("The vitals of the patient are:");
                 for(VitalSigns vit: pat.getAlldetails()){
                     System.out.println("RespiratoryRate:" + vit.getRespiratoryrate() + "\nHeartRate: "+ vit.getHeartrate()+ "\nBlood pressure: "+ vit.getBloodpressure() +"\nWeight: "+ vit.getWeightkgs());
                 }
                 System.out.println("The current patient \n Respiratory rate:"+ pat.getCurrentvit().getRespiratoryrate()+"\n Heart rate:"+ pat.getCurrentvit().getHeartrate()+"\n Blood pressure:"+pat.getCurrentvit().getBloodpressure()+"\nWeight:"+pat.getCurrentvit().getWeightkgs());
             }
            
             break;
         case 3:
             System.out.println("Exitting");
             System.exit(0);
             break;
         default:
             System.out.println("Invalid input");
         
     }
    }
}
}