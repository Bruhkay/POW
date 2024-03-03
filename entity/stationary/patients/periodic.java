package entity.stationary.patients;
public class Periodic extends Patients {

    public Periodic (String name, int x, int y){
        super(name, x, y);
        super.setInitial("P");
    }
    
}
