package grid;

import java.util.ArrayList;

public class City {

    Road[][] roads;
    Building[][] buildings;
    Mobile[][] mobiles;
    Stationary[][] stationarys;
    ArrayList<Order> orders;

    // city büyüyemeyeceği için array kullanmak daha kolay
    public City(int width, int height){
        this.orders = new ArrayList<Order>();

        roads = new Road[ width + 1][ height + 1];
        buildings = new Building[ width][ height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                roads[i][j] = new Road(i, j);
                buildings[i][j] = new Building(i, j);
            }    
        }

        // since the roads array is one size bigger, we fill in the edges
        for (int i = 0; i < height + 1; i++) {
            roads[width][i] = new Road(width, i);
        }
        for (int i = 0; i < width; i++) {
            roads[i][height] = new Building(i, height);
        }
    }

    public findMobile(Building static){
        // check what med it is
    }

    public findMobile(int[] coordinates){
        return this.findMobile(buildings[coordinates[0]][coordinates[1]]);
    }

    public findPath(Nurse mobile, Building static){
        // A*, mobile dan ve staticten kordinat alıcaz ve yapazağız
    }
    
    /**
     * @param building
     * @return the coordinates of the given building on the city grid
     */
    private int[] coordinateFinder(Building building){

    }

    /**
     * Does the vehicle choosing and sending order
     * @param med
     * @param building
     */
    public getOrder(Medicine med, Building building){
        // 
    }




}
