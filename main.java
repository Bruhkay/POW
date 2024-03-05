import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;

import entity.mobile.physcian.Nurses;
import entity.mobile.physcian.Scooters;
import entity.stationary.patients.Acut;
import entity.stationary.patients.Patients;
import entity.stationary.patients.Periodic;
import med.*;

public class main {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Patients> patientList = new ArrayList<Patients>();
        
        long start = System.nanoTime();
        final int executeDuration = 40; //how many seconds loop will continue
        final int updateFreq = 1; //how many seconds require for update 

        Patients patient1 = new Acut("Mert", 0, 0); // Coordinates should be updated according to patient's house.
        Patients patient2 = new Periodic("Ece", 0, 0);
        Patients patient3 = new Periodic("Sude", 0, 0);
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);

        /*
        Medicine m1 = new Pill("paroş");
        Medicine m2 = new Pill("lacoste");
        Medicine m3 = new Serum("lace");
        Medicine m4 = new Serum("lad");

        Nurses melike = new Scooters();

        melike.addToBaggage(m1);
        melike.addToBaggage(m2);
        melike.addToBaggage(m3);
        melike.addToBaggage(m4);
        */

        long count = 0; //this variable will increase each second. this will holds the running time by nanoseconds. And will updated at every 1 second.
        while(count < Math.pow(10, 9) * executeDuration){
            if(count < System.nanoTime()-start){
                count += Math.pow(10,9) * updateFreq;

                int a = rn.nextInt(3); //this will choose operation randomly such as adding Medicine to cart or buying Medicine
                int k = rn.nextInt(patientList.size()); //this will create number according to number of patients, randomly
                Patients randomPatient = patientList.get(k); //thanks to k variable, wee are able to choose patient from the list randomly

                if(a == 0){ // for waiting
                    //i can add a for loop to adjust time amount for waiting
                }

                else if(a == 1){ // for adding health product to baggage randomly
                    
                    int randomMedicine = rn.nextInt(2);

                    if(randomMedicine == 0){
                        Temperamental m = new Pill("parol");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }

                    else if(randomMedicine ==1){
                        Temperamental m = new Serum("nane");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                }

                else if(a == 2){ //this could be buying option
                    if(randomPatient.getCart().size() != 0){
                        System.out.println(randomPatient.getPatientsName()+ " successfully ordered. These; " + randomPatient.getCart());
                        randomPatient.setCartNull();
                    }
                }

                else if(a == 3){ //i not decided yet

                }

                else if(a == 4){ //i not decided yet

                }
                System.out.println((int)(count/(Math.pow(10,9))) + " days passed");
            }
        }       
    }
}
