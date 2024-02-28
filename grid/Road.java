package grid;

import java.util.*;

class Road {
    
    int[] coordinates;
    // maybe ArrayList for more complicated city arrangements in the future
    // though that would require a rework of a* which is not easy
    Building[] surroundingBuildings;
    Mobile contained;

/*     public Road(int[] coords, Nurse contained){
        this.coordinates = coords;
        this.contained = contained;
    }

    public Road(int x, int y, Nurse contained){
        this.coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;

        this.contained = contained;
    }
 */
    public Road(int x, int y){
        this.coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;

        this.contained = null;
    }

    public void setSurroundings(Building[] buildings){
        this.surroundingBuildings = buildings;
    }

    public void setSurroundings(Building building1, Building building2, Building building3, Building building4){
        this.surroundingBuildings = new Building[4];

        this.surroundingBuildings[0] = building1;
        this.surroundingBuildings[1] = building2;
        this.surroundingBuildings[2] = building3;
        this.surroundingBuildings[3] = building4;
    }

} 
