package entity.stationary.patients;
import java.util.ArrayList;

import entity.stationary.Stationary;
import med.medicine;

public class Patients extends Stationary {

    protected ArrayList<medicine> cart = new ArrayList<medicine>();

    protected String name;

    public Patients(String name){
        this.name = name;
    }
    public String getPatientsName(){
        return this.name;
    }
    public void addMedicine(medicine x){
        cart.add(x);
    }
    public ArrayList<medicine> getCart(){
        return cart;
    }
}
