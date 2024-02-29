package entity.mobile.physcian;
import java.util.ArrayList;

import entity.mobile.Mobile;
import med.Medicine;

public class Nurses extends Mobile {
    
    protected ArrayList<Medicine> baggage = new ArrayList<Medicine>();
    
    public ArrayList<Medicine> getBaggage() {
        return baggage;
    }
    public void addToBaggage(Medicine x) {
        this.baggage.add(x);
    }
    @Override
    public String toString() {
        String result = "";
        for (Medicine x : baggage){
            result += x;
        }
        return result;
    }
    
}
