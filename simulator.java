import java.util.Random;

import grid.City;
import grid.Order;
import grid.Stationary;

import java.util.ArrayList;

public class Simulator {
    
    public static void main(String[] args) {
        
        Random rn = new Random();
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Stationary> stationaries = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        int[] deneme = new int[2]; //mobileların henüz kordinatı yok diye şimdilik
        c1 = rn.nextInt(0,100);
        c2 = rn.nextInt(0,50);
        deneme[0] = c1;
        deneme[1] = c2;


        City ankara = new City(100, 50);

        for (int i = 0; i < 3; i++) {
            c1 = rn.nextInt(0,100);
            c2 = rn.nextInt(0,50);
            Stationary newBuilding = new Stationary(c1, c2);
            stationaries.add(newBuilding);
        }
        
        int a = rn.nextInt(0,stationaries.size() - 1);
            
        //Order newOrder = new Order(deneme, stationaries.get(a).getCoordinates()); 
        




    }
}
