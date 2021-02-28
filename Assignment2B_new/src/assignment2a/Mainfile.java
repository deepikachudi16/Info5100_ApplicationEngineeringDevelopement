/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2a;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Deepika Reddy
 */

public class Mainfile {
    
    public static void main(String[] args)
    {
        PatientDirectory patientDirectory= new PatientDirectory();
        PersonDirectory persondirectory= new PersonDirectory();
        EncounterHistory eh= new EncounterHistory();
        
        // HARD CODING PERSON DETAILS
        Person p1= new Person();
        p1.setFirstname("John");
        p1.setLastname("Abraham");
        p1.setPersonid(123);
        persondirectory.addPerson(p1); // pushing it to person directory
        
        
 
        Person p2= new Person();
        p2.setFirstname("Donald");
        p2.setLastname("Trump");
        p2.setPersonid(602);
        persondirectory.addPerson(p2);
        
        Person p3= new Person();
        p3.setFirstname("Narendra");
        p3.setLastname("Modi");
        p3.setPersonid(1);
        persondirectory.addPerson(p3);
        
         Person p4= new Person();
        p4.setFirstname("Shiva");
        p4.setLastname("Shankar");
        p4.setPersonid(420);
        persondirectory.addPerson(p4);
        
        Person p5= new Person();
        p5.setFirstname("Deepika");
        p5.setLastname("Chudi");
        p5.setPersonid(234);
        persondirectory.addPerson(p5); 
        
        Person p6= new Person();
        p6.setFirstname("Dinesh");
        p6.setLastname("Reddy");
        p6.setPersonid(234);
        persondirectory.addPerson(p6);
        
        //here evry patient is a person.
        // Here we added 6 Persons out of which only 4 are patients
        
        Patient pat1 = new Patient(p1);
        Patient pat2 = new Patient(p2);
        Patient pat3 = new Patient(p3);
        Patient pat4 = new Patient(p4);
        
        patientDirectory.addPerson(pat1);
        patientDirectory.addPerson(pat2);
        patientDirectory.addPerson(pat3);
        patientDirectory.addPerson(pat4); // adding this to patient as every pa
        
    
        //  Hardcoding vital signs to encounter and from encounter to encounter history and encounter histroy to patient
        VitalSigns v1= new VitalSigns();
        v1.setRespiratoryrate(35);
        v1.setHeartrate(135);
        v1.setBloodpressure(60);
        v1.setWeightkgs(2);
        v1.setAgegroup(1);
        
        
        VitalSigns v2= new VitalSigns();
        v2.setRespiratoryrate(14);
        v2.setHeartrate(100);
        v2.setBloodpressure(100);
        v2.setWeightkgs(59);
        v2.setAgegroup(6);
        
        Encounter e1= new Encounter();
        e1.setVittysigns(v1);
        Date timeNow = new Date(System.currentTimeMillis());
        e1.setTimestamp(timeNow.toString());
        
        Encounter e2= new Encounter();
        e2.setVittysigns(v2);
        Date timeNow1 = new Date(System.currentTimeMillis());
        e1.setTimestamp(timeNow1.toString());
        
        EncounterHistory ehh1= new EncounterHistory();
        ehh1.addEncounter(e1);
        pat1.setEncphistory(ehh1);
        patientDirectory.addPerson(pat1);
        
        EncounterHistory ehh2= new EncounterHistory();
        ehh2.addEncounter(e1);
        pat2.setEncphistory(ehh2);
        patientDirectory.addPerson(pat2);
        
        
        //City Hardcoding
        
       Houses h1= new Houses();
       h1.setHousenumber(000);
       h1.addPerson(p1);
       
       Houses h2= new Houses();
       h2.setHousenumber(111);
       h2.addPerson(p2);
       
       Houses h3= new Houses();
       h3.setHousenumber(222);
       h3.addPerson(p3);
       
       Houses h4= new Houses();
       h4.setHousenumber(333);
       h4.addPerson(p4);
       
       Houses h5= new Houses();
       h5.setHousenumber(000);
       h5.addPerson(p5);
       
       Community c1= new Community();
       c1.setCommunity("Cityview");
       c1.addHouse(h1);
       c1.addHouse(h2);
       c1.addHouse(h3);
       
       Community c2 = new Community();
       c2.setCommunity("Huntington Avenue");
       c2.addHouse(h4);
       c2.addHouse(h5);
       
       City city1 = new City();
       city1.addCommunity(c1);
       city1.addCommunity(c2);
       city1.setCity("Boston");
       
        boolean isNormal=false;
        boolean isVitalNormal=false;
        
       
        
     while(true){
         System.out.println("------------------------------------------");
         System.out.println("******Welcome to Boston's Health Care*******");
         System.out.println("------------------------------------------");
        System.out.println("Choose Options\n"
                + "1. Add Detials \n"
                + "2. View Details \n"
                + "3. To View Abnormal Patients in Boston\n"
                + "4. Exit");
        System.out.println("--------------------------------------------");
     Scanner sc= new Scanner(System.in);
     int menuoption = sc.nextInt();
     
     switch(menuoption){
         case 1:
             VitalSigns vits= new VitalSigns();
             System.out.println("Enter Details");
              System.out.println("Enter Patient ID:");
              int patientid=sc.nextInt();
             
             //After entering patient id, we need to fetch the patient from the patient directory at first, if found, 
             //we need to add a encounter to the patient's encounter history. ELse if there is person with same id in patient directory,
             //get that person and create a new Patient from Person and add ecnounter. ELse print a message saying there is no person with the givrn id.
             
             Patient presentpatient= patientDirectory.GetPatientById(patientid);
             
             if(presentpatient == null){
                 Person presentPerson = persondirectory.getPersonById(patientid);
                 if(presentPerson == null){
                     System.out.println("***There is no such person in the city \n Please enter valid Person id***");
                     break;
                 }
                 else{
                     Patient pat = new Patient(presentPerson);
                     patientDirectory.addPerson(pat);
                     presentpatient = pat;
                 }
             }

             
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
            
            Encounter enc = new Encounter();
            //enc.setTimestamp(time);
            enc.setVittysigns(vits);
            
            presentpatient.encphistory.addEncounter(enc);
           
            isNormal= presentpatient.isPatientNormal();
//            System.out.println("----------------------");
//            System.out.println("To check whether Vital sign is normal or not");
//          System.out.println("1. Respiratoryrate\n"
//                  + "2.Heartrate\n"
//                  + "3.Bloodpressure\n"
//                   + "4.Weight\n");
//            System.out.println("----------------------");
//            int vitalgroup=sc.nextInt();
//            vits.setVitalgroup(vitalgroup);
//               isVitalNormal=vits.isVitalSignNormal(vitalgroup);
          
            break;
         
         case 2:
             
             System.out.println("------*************Patient Details**************------");
             for(Patient pat: patientDirectory.getPatient()){
                
                 System.out.println("--------------------------------------------------");
                  System.out.println("Patient ID:" + pat.getPersonid());
                 System.out.println("\nName of the patient is:" + pat.getFirstname()+" " + pat.getLastname());
                
                 
                                 
                 for(Encounter encp: pat.getEncphistory().getEncounterHistory()){
                 
                     System.out.println("\nThe Encounter history of the patient are:");
  //                  System.out.println("The timestamp is:"+ encp.getTimestamp());
                     VitalSigns vit = encp.getVittysigns();
                     System.out.println("**RespiratoryRate:" + vit.getRespiratoryrate() + "\n**HeartRate: "+ vit.getHeartrate()+ "\n**Blood pressure: "+ vit.getBloodpressure() +"\n**Weight: "+ vit.getWeightkgs());
                     System.out.println("-------------------------------------------------------");
                     }
             }
             
            
             break;
         case 3:
             System.out.println("You have selected to view the number of abnormal patients in boston");
             int counter = 0;
             int communitycounter=0;
             for(Community c: city1.Getcomm()){
                 for(Houses h: c.getComhouses()){
                     for(Person p: h.getPersonhou()){
                         Patient existingPatient = patientDirectory.GetPatientById(p.getPersonid());
                         if(existingPatient != null){
                             if(existingPatient.encphistory.GetSize()>0){
                                 Encounter latestEncounter = existingPatient.encphistory.getEncounterHistory().get(existingPatient.encphistory.GetSize()-1);
                              VitalSigns vitals = latestEncounter.vittysigns;
                              if(!vitals.isVitalSignNormal(3)){
                                  counter++;
                                  communitycounter++;
                              }
                             }
                              
                         }
                     }
                 }
                 System.out.println("The number of patients with abnormality in this Community: \n" +communitycounter);
                 communitycounter=0;
             }
             System.out.println("=============================================================================================");
             System.out.println("In city boston, we have "+ counter + " abnormal patients with HIGH blood pressure");
             System.out.println("=============================================================================================");
             break;
             
         case 4:
             System.out.println("Exiting");
             System.exit(0);
         default:
             
             System.out.println("Invalid input");
         
     }
    }
}
}