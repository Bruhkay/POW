import java.util.Random;
import java.util.random.*;

import entity.mobile.physcian.Nurses;
import entity.mobile.physcian.Scooters;
import entity.stationary.Stationary;
import entity.stationary.patients.Acut;
import entity.stationary.patients.Patients;
import entity.stationary.patients.Periodic;
import med.*;

public class main {
    public static void main(String[] args) {
        Random rn = new Random();
        
        long start = System.nanoTime();
        final int executeDuration = 20; //how many seconds loop will continue
        final int updateFreq = 1; //how many seconds require for update 

        Patients patient1 = new Acut("Mert");
        Patients patient2 = new Periodic("Ece");
        medicine m1 = new Pill("paroş");
        medicine m2 = new Pill("lacoste");
        medicine m3 = new Serum("lace");
        medicine m4 = new Serum("lad");

        Nurses melike = new Scooters();

        melike.addToBaggage(m1);
        melike.addToBaggage(m2);
        melike.addToBaggage(m3);
        melike.addToBaggage(m4);

        long count = 0;
        while(count < Math.pow(10, 9) * executeDuration){
            if(count < System.nanoTime()-start){
                count += Math.pow(10,9) * updateFreq;

                int a = rn.nextInt(5);
                if(a == 0){ // for waiting
                    //i can add a for loop to adjust time amount for waiting
                }
                else if(a == 1){ // for adding health product to baggage
                    int k = rn.nextInt(2);
                    if(k == 0){
                        temperamental m = new Pill("paroş");
                        patient1.addMedicine(m);
                        System.out.println(m.getName()+ " is successfully added to cart.");
                    }
                    else if(k ==1){
                        temperamental m = new Serum("nane");
                        patient1.addMedicine(m);
                        System.out.println(m.getName()+ " is successfully added to cart.");
                    }
                }
                else if(a == 2){
                    
                }
                else if(a == 3){

                }
                else if(a == 4){

                }
                


            }
        }

        System.out.println(patient1.getPatientsName() + " asked for these; " +patient1.getCart());
        
    }
}
