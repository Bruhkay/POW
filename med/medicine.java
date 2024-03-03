package med;

import entity.*;
/**
 * medicine
 */
public abstract class Medicine {
    protected static int ID = 0;
    private int time;

public void setDrugTime(int time){
    this.time = time;
}
}