package entity.mobile.physcian;
import java.util.ArrayList;

import entity.mobile.Mobile;
import med.medicine;

public class Nurses extends Mobile {
    
    protected ArrayList<medicine> baggage = new ArrayList<medicine>();
    
    public ArrayList<medicine> getBaggage() {
        return baggage;
    }
    public void addToBaggage(medicine x) {
        this.baggage.add(x);
    }
    @Override
    public String toString() {
        String result = "";
        for (medicine x : baggage){
            result += x;
        }
        return result;
    }
    
}
