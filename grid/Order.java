package grid;
import java.util.*;
import entity.mobile.physcian.Nurses;
import med.Medicine;

public class Order {
    
    int[] startingCord;
    int[] finishingCord;
    boolean assigned = false;
    boolean completed = false;
    ArrayList<int[]> path;
    Medicine carriedMedication;
    public static ArrayList<Order> assignedOrders = new ArrayList<Order>();
    public static ArrayList<Order> completedOrders = new ArrayList<Order>();

    //atakan biz burda pathi array arraylisti yaptık da, biz citydeki 
    //find pathde road array listi olarak kullandık sıkıntı çıkarmaz mı bu????

    public void orderFiller(Nurses nurse, Stationary stationary, ArrayList<int[]> path){
        this.assigned = true;
        this.path = new ArrayList<int[]>();
    }
     
    // constructors
    public Order(int[] startingCord, int[] finishingCord, Medicine carriedMedication){
        this.startingCord = startingCord;
        this.finishingCord = finishingCord;
        this.carriedMedication = carriedMedication;
    }

    public Order(int[] startingCord, int[] finishingCord){
        this.startingCord = startingCord;
        this.finishingCord = finishingCord;
    }

    // manifest order path dolacak??
    
    //getter methods
    public int[] getStartingCord() {
        return this.startingCord;
    }

    public int[] getFinishingCord() {
        return this.finishingCord;
    }

    public boolean isAssigned() {
        return this.assigned;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public ArrayList<int[]> getPath() {
        return this.path;
    }

    public Medicine getCarriedMedication() {
        return this.carriedMedication;
    }

    //setter methods
    public void setAssignedOrder(boolean assigned){
        this.assigned = assigned;
        assignedOrders.add(this);
    }

    public void setCompletedOrder(boolean completed){
        this.completed = completed;
        completedOrders.add(this);
    }

} 
