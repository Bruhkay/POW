package med;

import entity.*;
/**
 * medicine
 */
public abstract class Medicine {
    protected static int ID = 0;
    private int time;
    private double price;
    
    /**
     * Specific time for each medicines
     * @param time drug intake time
     */
    public void setDrugTime(int time){
        this.time = time;
    }

    /**
     * Assign a price to each medicine. (in order to calculate totol price that cart has)
     * @param price medicine price
     */
    public void setPrice(double price){
        this.price = price;
    }
    public static int getID() {
        return ID;
    }
}