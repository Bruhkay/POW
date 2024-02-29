package entity.stationary.patients;
import java.util.ArrayList;

import entity.stationary.Stationary;
import med.Medicine;

public class Patients extends Stationary {

    protected ArrayList<Medicine> cart = new ArrayList<Medicine>();

    protected String name;

    public Patients(String name){
        this.name = name;
    }
    public String getPatientsName(){
        return this.name;
    }
    public void addMedicine(Medicine x){
        cart.add(x);
    }
    public ArrayList<Medicine> getCart(){
        return cart;
    }
    public int getCartSize(){
        return cart.size();
    }
    public void setCartNull(){
        this.cart = new ArrayList<Medicine>();
    }
}
