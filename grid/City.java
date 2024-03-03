package grid;

import java.util.*;

import org.w3c.dom.Node;

import entity.mobile.*;
import entity.mobile.physcian.Nurses;
import entity.mobile.physcian.Vans;
import entity.stationary.*;
import entity.stationary.patients.Periodic;

public class City {

    Road[][] roads;
    Building[][] buildings;
    Mobile[][] mobiles;
    Stationary[][] stationarys;
    ArrayList<Order> orders;
    int width;
    int height;

    // city büyüyemeyeceği için array kullanmak daha kolay
    public City(int width, int height){
        this.width = width;
        this.height = height;

        this.orders = new ArrayList<Order>();

        roads = new Road[ width + 1][ height + 1];
        buildings = new Building[ width][ height];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                roads[i][j] = new Road(i, j);
                buildings[i][j] = new Building(i, j);
            }    
        }

        // since the roads array is one size bigger, we fill in the edges
        for (int i = 0; i < height + 1; i++) {
            roads[width][i] = new Road(width, i);
        }
        for (int i = 0; i < width; i++) {
            roads[i][height] = new Road(i, height);
        }
    }

    public int[] findMobile(Building stationary){
        // check what med it is
        // Melike daireler ile bulunacak
        return null;
    }

    public int[] findMobile(int[] coordinates){
        return this.findMobile(buildings[coordinates[0]][coordinates[1]]);
    }

    public List<Road> findPath(Nurses mobile, Building stationary){
        // Create open and closed lists
        List<Road> open = new ArrayList<>();
        Set<Road> closed = new HashSet<>();

        // Add start Road to open list
        open.add(mobile.getCurrentRoad()); 

        // clarify the end road
        Road endRoad = stationary.getEntrence();

        while (!open.isEmpty()) {
            // Get the Road with the lowest f value from open list
            Road current = open.stream().min(Comparator.comparingInt(Road::totalCost)).get();

            // Remove current Road from open list
            open.remove(current);

            // Add current Road to closed list
            closed.add(current);

            // If we reached the end Road, reconstruct and return the path
            if (current == endRoad) {
                List<Road> path = new ArrayList<>();
                Road node = current;
                while (node != null) {
                    path.add(node);
                    node = node.getParent();
                }
                Collections.reverse(path);
                return path;
            }

            // Generate neighboring nodes
            List<Road> neighbors = new ArrayList<>();

            // Generate neighboring nodes based on grid dimensions and obstacles
            int[] currentSCoords = current.getCoords();

            if( currentSCoords[0] != this.width + 1){
                neighbors.add(roads[currentSCoords[0] + 1][currentSCoords[1]]);
            }

            if( currentSCoords[0] != 0){
                neighbors.add(roads[currentSCoords[0] - 1][currentSCoords[1]]);
            }

            if( currentSCoords[1] != this.height + 1){
                neighbors.add(roads[currentSCoords[0]][currentSCoords[1] + 1]);
            }

            if( currentSCoords[1] != 0){
                neighbors.add(roads[currentSCoords[0]][currentSCoords[1] - 1]);
            }


            for (Road neighbor : neighbors) {
/*                 if (closed.contains(neighbor)) {
                    continue; // Skip this neighbor, it is already evaluated
                }
 */

                int tentativeG = current.getCostFromStart() + 1; // Assuming each step has a cost of 1

                if (!open.contains(neighbor) || tentativeG < neighbor.g) {
                    neighbor.parent = current;
                    neighbor.setCostFromStart(tentativeG);
                    neighbor.setCostToFinish(calculateHeuristic(neighbor, endRoad));
                    if (!open.contains(neighbor)) {
                        open.add(neighbor);
                    }
                }
            }
        }
        return null; // No path found
    }

    private static int calculateHeuristic(Road node, Road endNode) {
        // Manhattan distance heuristic
        return Math.abs(node.getCoords()[0] - endNode.getCoords()[0]) + Math.abs(node.getCoords()[1] - endNode.getCoords()[1]);
    }
    
    /**
     * @param building
     * @return the coordinates of the given building on the city grid
     */
    /* private int[] coordinateFinder(Building building){
        // Atakan building kordinatlarını gönder
        // ayrıca bnu road için de yap
        // HashMap
    } */

    /**
     * Does the vehicle choosing and sending order
     * @param med
     * @param building
     */
    public getOrder(Medicine med, Building building){
        // path bulunup order yapılmalı
    }

    /**
     * Builds a building at a given coordinate the size and width wanted
     */
    public Building buildCustomeBuilding(int x, int y, int width, int height, Building buildingInside){

        // hollowing the inside of the wanted building of roads
        for (int i = x + 1; i < x + width; i++) {
            for( int j = x + 1; j < x + width; j++){
                roads[i][j] = null;
            }
        }

        // creating and allocating a building to the monstrocity
        buildings[x][y] = new Building(x, y);

        return buildings[x][y];
    }

    /**
     * Creates a map of the city
     */
    public String viewMap(){
        StringBuilder map = new StringBuilder("");
        StringBuilder primaryRow = new StringBuilder("");
        StringBuilder secondaryRow = new StringBuilder("");

        // write an index map to the top
        for (int i = 0; i < roads.length; i++) {
            map.append(" " + i + " ");
        }
        map.append("\n");
        

        for (int i = 0; i < roads.length; i++) {

            // write the index to the left for convenience
            primaryRow.append(" " + i + " ");

            for (int j = 0; j < roads[0].length; j++) {
                // diplaying vehicle
                if(roads[i][j].getContained() == null){
                    primaryRow.append(" . ");
                }
                else if(roads[i][j].getContained() instanceof Vans){
                    primaryRow.append(" V ");
                }
                else{
                    primaryRow.append(" S ");
                }

                // draw the road rightwards
                if( i < this.width && roads[i + 1][j] != null){
                    // WE CAN WRİTE THE TRAFFIC IN THE MİDDLE WİTH f"-{road.traffic}-"
                    primaryRow.append("---");
                }
                
                // draw the road downward
                if( j < this.height && roads[i][j + 1] != null){
                    secondaryRow.append(" | ");
                }

                // draw the building
                if( roads[i][j].getEntrenceOf() == null){
                    secondaryRow.append(" . ");
                }
                else if( roads[i][j].getEntrenceOf() instanceof Pharmacy){
                    secondaryRow.append(" M ");
                }
                else if( roads[i][j].getEntrenceOf() instanceof Periodic){
                    secondaryRow.append(" P ");
                }
                else{
                    secondaryRow.append(" A ");
                }

            }
            // append to final map and clear rows
            map.append(primaryRow + "\n");
            map.append(secondaryRow + "\n");
            primaryRow.delete(0, primaryRow.length());
            secondaryRow.delete(0, secondaryRow.length());
        }

        return map.toString();
    }


}
