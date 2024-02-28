package grid;

import java.util.*;



class Building{
    
    int[] coordinates;
    Road[] surroundingRoads;
    Object contained;

    public Building(int[] coords, Object contained){
        this.coordinates = coords;
        this.contained = contained;
    }

    public Building(int x, int y, Object contained){
        this.coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;

        this.contained = contained;
    }

    public void setRoads(Road[] roads){
        this.surroundingRoads = roads;
    }

    public void setRoads(Road road1, Road road2, Road road3, Road road4){
        this.surroundingRoads = new Road[4];

        this.surroundingRoads[0] = road1;
        this.surroundingRoads[1] = road2;
        this.surroundingRoads[2] = road3;
        this.surroundingRoads[3] = road4;
    }
    // city büyüyemeyeceği için array kullanmak daha kolay
    /* public static buildCity(){

    } */
}