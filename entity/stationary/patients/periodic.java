/**
 * This is a periodic patient class
 * Periodic patients are people who need specific pills constantly.
 * They mostly take their deugs three times a day as morning, noon, night.
 */

 package entity.stationary.patients;
 public class Periodic extends Patients {
 
     public Periodic (String name, int x, int y){
         
         super(name, x, y);
         super.setInitial("P");
     }
     
 }
 