package grid;
import java.util.*;

import med.Medicine;

public class Order {
    
    //Medicine med;   // medicine is an abstract class, so we cant initialize 
    int[] startingCord;
    int[] finishingCord;
    boolean assigned = false;
    boolean completed = false;
    ArrayList<int[]> path;
    Medicine carriedMedication;

    // Mobile orderFiller;   // same issue with above

     
    // constructor
    public Order(int[] startingCord, int[] finishingCord, Medicine carriedMedication){
        this.startingCord = startingCord;
        this.finishingCord = finishingCord;
        this.carriedMedication = carriedMedication;
    }

    public Order(int[] startingCord, int[] finishingCord){
        this.startingCord = startingCord;
        this.finishingCord = finishingCord;
    }

    // manifest order path dolacak
    public manifestOrderPath(){

    }

    // fill order
    
    public void setAssignedOrder(boolean assigned){
        this.assigned = assigned;
    }

    public void setCompleteOrder(boolean completed){
        this.completed = completed;
    }

} 
