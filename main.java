import java.util.ArrayList;
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
        ArrayList<Patients> patientList = new ArrayList<Patients>();
        
        long start = System.nanoTime();
        final int executeDuration = 20; //how many seconds loop will continue
        final int updateFreq = 1; //how many seconds require for update 

        Patients patient1 = new Acut("Mert");
        Patients patient2 = new Periodic("Ece");
        medicine m1 = new Pill("paroş");
        medicine m2 = new Pill("lacoste");
        medicine m3 = new Serum("lace");
        medicine m4 = new Serum("lad");
        Patients patient3 = new Periodic("Sude");

        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);

        /*
        medicine m1 = new pill("paroş");
        medicine m2 = new pill("lacoste");
        medicine m3 = new serum("lace");
        medicine m4 = new serum("lad");

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

                int a = rn.nextInt(3); //this will choose operation randomly such as adding medicine or buying medicine
                int k = rn.nextInt(patientList.size()); //this will create number according to number of patients, randomly
                Patients randomPatient = patientList.get(k); //thanks to k variable, wee are able to choose patient from the list randomly

                if(a == 0){ // for waiting
                    //i can add a for loop to adjust time amount for waiting
                }
                else if(a == 1){ // for adding health product to baggage
                    int k = rn.nextInt(2);
                    if(k == 0){
                        temperamental m = new Pill("paroş");
                        patient1.addMedicine(m);
                        System.out.println(m.getName()+ " is successfully added to cart.");

                else if(a == 1){ // for adding health product to baggage randomly
                    
                    int randomMedicine = rn.nextInt(2);

                    if(randomMedicine == 0){
                        temperamental m = new pill("parol");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " is added "+m.getName()+ " to cart.");
                    }
                    else if(k ==1){
                        temperamental m = new Serum("nane");
                        patient1.addMedicine(m);
                        System.out.println(m.getName()+ " is successfully added to cart.");
                    else if(randomMedicine ==1){
                        temperamental m = new serum("nane");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " is added "+m.getName()+ " to cart.");
                    }
                }

                else if(a == 2){ //this could be buying option
                    if(randomPatient.getCart().size() != 0){
                        System.out.println(randomPatient.getPatientsName()+ " is successfully ordered. These; " + randomPatient.getCart());
                        randomPatient.setCartNull();
                    }
                }

                else if(a == 3){ //i not decided yet

                }

                else if(a == 4){ //i not decided yet

                }
                System.out.println(count/1000000000 + " days passed");
            }
        }       
    }
}
