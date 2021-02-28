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
public class VitalSigns {
    private double respiratoryrate;
    private int heartrate;
    private int bloodpressure;
    private double weightkgs;
    private double weightpounds;
    private int agegroup;
    private int vitalgroup;

    public int getVitalgroup() {
        return vitalgroup;
    }

    public void setVitalgroup(int vitalgroup) {
        this.vitalgroup = vitalgroup;
    }

    public int getAgegroup() {
        return agegroup;
    }

    public void setAgegroup(int agegroup) {
        this.agegroup = agegroup;
    }

    public double getRespiratoryrate() {
        return respiratoryrate;
    }

    public void setRespiratoryrate(double respiratoryrate) {
        this.respiratoryrate = respiratoryrate;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public int getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(int bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public double getWeightkgs() {
        return weightkgs;
    }

    public void setWeightkgs(double weightkgs) {
        this.weightkgs = weightkgs;
    }

    public double getWeightpounds() {
        return weightpounds;
    }

    public void setWeightpounds(double weightpounds) {
        this.weightpounds = weightpounds;
    }

 
    public boolean isVitalSignNormal(int vitalgroup) {

    int agegroup = this.agegroup;
    switch(vitalgroup){

        case 1: 
            if( agegroup ==1){
                  if(respiratoryrate >=30 && respiratoryrate<=50)
                  {
                    System.out.println("Respiratory rate is normal");
                    return true;
                  }else{
                    System.out.println("The Newborn as Bradycardia, Take Immediate help");
                    return false;
                  }
            }
            if( agegroup ==2){
                  if(respiratoryrate >=20 && respiratoryrate<=30)
                  {
                    System.out.println("Respiratory rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }
            }
            if( agegroup ==3){
                  if(respiratoryrate >=20 && respiratoryrate<=30)
                  {
                    System.out.println("Respiratory rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }
            }
            if( agegroup ==4){
                  if(respiratoryrate >=20 && respiratoryrate<=30)
                  {
                    System.out.println("Respiratory rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }
            }
            if( agegroup ==5){
                  if(respiratoryrate >=20 && respiratoryrate<=30)
                  {
                    System.out.println("Respiratory rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }
            }
            if( agegroup ==6){
                  if(respiratoryrate >=12 && respiratoryrate<=20)
                  {
                    System.out.println("Respiratory rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }
            }
                  break;
    case 2:

            if( agegroup ==1){
                  if(heartrate >=30 && respiratoryrate<=50)
                  {
                    System.out.println("Heart rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }   
            }
            if( agegroup ==2){
                  if(heartrate >=80 && respiratoryrate<=140)
                  {
                    System.out.println("Heart rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }  
            }
            if( agegroup ==3){
                  if(heartrate >=80 && respiratoryrate<=130)
                  {
                    System.out.println("Heart rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  } 
            }
            if( agegroup ==4){
                  if(heartrate >=80 && respiratoryrate<=120)
                  {
                    System.out.println("Heart rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  } 
            }
            if( agegroup ==5){
                  if(heartrate >=70 && respiratoryrate<=110)
                  {
                    System.out.println("Heart rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }   
            }
            if( agegroup ==6){
                  if(heartrate >=55 && respiratoryrate<=105)
                  {
                    System.out.println("Heart rate is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }   
            }
                break;
    case 3:
        if( agegroup ==1){
                  if(bloodpressure >=50 && bloodpressure<=70)
                  {
                    //System.out.println(" Blood pressure is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }   
        }
         if( agegroup ==2){
                  if(bloodpressure >=70 && bloodpressure<=100)
                  {
                   // System.out.println(" Blood pressure is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }
         }
         if( agegroup ==3){
                  if(bloodpressure >=80 && bloodpressure<=110)
                  {
                   // System.out.println(" Blood pressure is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }  
         }
         if( agegroup ==4){
                  if(bloodpressure >=80 && bloodpressure<=110)
                  {
                    //System.out.println(" Blood pressure is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }  
         }
         if( agegroup ==5){
                  if(bloodpressure >=80 && bloodpressure<=120)
                  {
                    //System.out.println(" Blood pressure is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  }    
         }
         if( agegroup ==6){
                  if(bloodpressure >=110 && bloodpressure<=120)
                  {
                   // System.out.println(" Blood pressure is normal");
                    return true;
                  }else{
                    System.out.println("Take to Hospital");
                    return false;
                  } 
         }
           break;
    case 4:
           if( agegroup ==1){
                  if(weightkgs >=2 && weightkgs<=3)
                  {
                    System.out.println(" Weight is normal");
                    return true;
                  }else{
                    System.out.println("Take needs to get fit");
                    return false;
                  } 
           }
           if( agegroup ==2){
                  if(weightkgs >=4 && weightkgs<=10)
                  {
                    System.out.println(" Weight is normal");
                    return true;
                  }else{
                    System.out.println("Take needs to get fit");
                    return false;
                  }    
           }
           if( agegroup ==3){
                  if(weightkgs >=10 && weightkgs<=14)
                  {
                    System.out.println(" Weight is normal");
                    return true;
                  }else{
                    System.out.println("Take needs to get fit");
                    return false;
                  }    
           }
           if( agegroup ==4){
                  if(weightkgs >=14 && weightkgs<=18)
                  {
                    System.out.println(" Weight is normal");
                    return true;
                  }else{
                    System.out.println("Take needs to get fit");
                    return false;
                  }    
           }
           if( agegroup ==5){
                  if(weightkgs >=20 && weightkgs<=42)
                  {
                    System.out.println(" Weight is normal");
                    return true;
                  }else{
                    System.out.println("Take needs to get fit");
                    return false;
                  }  
           }
            if( agegroup ==6){
                  if(weightkgs >50)
                  {
                    System.out.println(" Weight is normal");
                    return true;
                  }else{
                    System.out.println("Take needs to get fit");
                    return false;
                  }  
            }break;
    default:
        System.out.println("Invlaid input");

    }
return false;

    
    
    
}
}
