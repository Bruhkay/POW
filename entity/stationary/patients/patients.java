package entity.stationary.patients;
import java.util.ArrayList;

import med.Medicine;

public class Patients extends grid.Stationary {

    protected ArrayList<Medicine> cart = new ArrayList<Medicine>();

    protected String name;

    public Patients(String name, int x, int y){
        super(x, y);
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
