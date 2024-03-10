/**
 * This is temperamental class.
 * Those pills are prescribed for temporal situations. (eg: antibiotics for flu)
 *                                                                                                  Vans(?) will cater them
 */

 package med;
 import entity.*;
 public class Temperamental extends Medicine {
     protected String name;
     protected int ID;
 
     
     public Temperamental(String name){
         this.name = name;
         this.ID = super.ID;
         super.ID++;
     }
     
     public String getName() {
         return name + " "+ ID;
     }
     @Override
     public String toString() {
         return getName();
     }
     
 
 }
 