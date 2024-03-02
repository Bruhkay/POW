package entity.mobile.physcian;
import java.util.ArrayList;

import entity.mobile.Mobile;
import med.Medicine;

public class Nurses extends Mobile {
    
    protected ArrayList<Medicine> baggage = new ArrayList<Medicine>();
    
    /**
     * Give all medicines located in baggage
     * @return baggage
     */
    public ArrayList<Medicine> getBaggage() {
        return baggage;
    }

    /**
     * Nurse added new medine to baggage
     * @param x added medicine
     */
    public void addToBaggage(Medicine x) {
        this.baggage.add(x);
    }
    /**
     * When nurse deliver medicine to patient baggage update its current medicines
     * @param x given medicine 
     */
    public void giveMedicine(Medicine x){
        this.baggage.remove(x);
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
