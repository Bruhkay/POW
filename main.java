import java.util.random.*;
import med.*;

public class main {
    public static void main(String[] args) {
        
        long start = System.nanoTime();
        final int executeDuration = 20; //how many seconds loop will continue
        final int updateFreq = 3; //how many seconds require for update 
        stationary patient1 = new acut("Mert");
        stationary patient2 = new periodic("Ece");
        medicine m1 = new pill("paroş");
        medicine m2 = new pill("lacoste");
        medicine m3 = new serum("lace");
        medicine m4 = new serum("lad");

        nurses melike = new scooters();

        melike.addToBaggage(m1);
        melike.addToBaggage(m2);
        melike.addToBaggage(m3);
        melike.addToBaggage(m4);

        long count = 0;
        while(count < Math.pow(10, 9) * executeDuration){
            if(count < System.nanoTime()-start){
                count += Math.pow(10,9) * updateFreq;




            }
        }

        System.out.println(patient1 + " asked for these; " +melike.getBaggage());
        
    }
}
