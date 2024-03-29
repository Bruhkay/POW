import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;

import entity.mobile.physcian.Nurses;
import entity.mobile.physcian.Scooter;
import entity.stationary.patients.Acut;
import entity.stationary.patients.Patients;
import entity.stationary.patients.Periodic;
import med.*;

public class main 
{
    public static void main(String[] args) 
    {
        Random rn = new Random();
        ArrayList<Patients> patientList = new ArrayList<Patients>();
        ArrayList<Nurses> nurseList = new ArrayList<Nurses>();
        
        long start = System.nanoTime();
        final int executeDuration = 40; //how many seconds loop will continue
        final int updateFreq = 1; //how many seconds require for update 

        Patients patient1 = new Acut("Mert",3,5);
        Patients patient2 = new Periodic("Ece",6,7);
        Patients patient3 = new Periodic("Sude",1,1);
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);

        
        Nurses melike = new Scooter("melike");
        Nurses atakan = new Scooter("atakan");
        nurseList.add(melike);
        nurseList.add(atakan);
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
        while(count < Math.pow(10, 9) * executeDuration)
        {
            if(count < System.nanoTime()-start)
            {
                count += Math.pow(10,9) * updateFreq;

                int a = rn.nextInt(3); //this will choose operation randomly such as adding Medicine to cart or buying Medicine
                int k = rn.nextInt(patientList.size()); //this will create number according to number of patients, randomly
                Patients randomPatient = patientList.get(k); //thanks to k variable, wee are able to choose patient from the list randomly
                int l = rn.nextInt(nurseList.size()); 
                Nurses randomNurse = nurseList.get(l);
                if(a == 0){ // for waiting
                    //i can add a for loop to adjust time amount for waiting
                }

                else if(a == 1){ 
                    // for adding health product to baggage randomly
                    
                    int randomMedicine = rn.nextInt(14);

                    /*if(randomMedicine == 0){
                        Temperamental m = new Pill("parol");
                        randomPatient.addMedicine(m);
                    }

                    else if(randomMedicine ==1){
                        Temperamental m = new Serum("tuzlu su");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==2){
                        Temperamental m = new Pill("arveles");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==3){
                        Temperamental m = new Pill("endorfin");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==4){
                        Temperamental m = new Pill("nurofen");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==5){
                        Temperamental m = new Pill("dolven");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==6){
                        Temperamental m = new Pill("aferin");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==7){
                        Temperamental m = new Pill("insulin");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==8){
                        Temperamental m = new Pill("iburamin");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+" to cart.");
                    }
                    else if(randomMedicine ==9){
                        Temperamental m = new Pill("forza");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==10){
                        Temperamental m = new Pill("antibiyotik");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==11){
                        Temperamental m = new Pill("augmentin");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==12){
                        Temperamental m = new Pill("pastil");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }
                    else if(randomMedicine ==13){
                        Temperamental m = new Pill("tylohot");
                        randomPatient.addMedicine(m);
                        System.out.println(randomPatient.getPatientsName() + " added "+m.getName()+ " to cart.");
                    }*/
                }

                else if(a == 2){ //this could be buying option
                    if(randomPatient.getCart().size() != 0){
                        System.out.println(randomPatient.getPatientsName()+ " successfully ordered. These; " + randomPatient.getCart());
                        randomNurse.addToBaggage(randomPatient.getCart());
                        System.out.println(randomNurse.getName()+ " successfully delivered to"+ randomPatient.getPatientsName());
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

        System.out.println("\nResult: ");
        for(int i = 0; i < patientList.size();  i++)
        {
        System.out.println( patientList.get(i).getPatientsName() + patientList.get(i).getCart());
        }
    
    }
}
