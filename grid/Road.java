package grid;

import java.util.*;

import org.w3c.dom.Node;

import entity.mobile.Mobile;

public class Road {
    
    int[] coordinates;
    // maybe ArrayList for more complicated city arrangements in the future
    // though that would require a rework of a* which is not easy
    Building[] surroundingBuildings;
    Mobile contained;                                                //its abstract!!!   
    int costFromStart; // Cost from start node to current node
    int costToFinish; // Heuristic (estimated cost from current node to goal node)
    Road parent; 
    Building entrenceOf;
    boolean isThereRoad; //if there is no road there might be a building

    // melike boolean, constructor içine bina alma ve getter setter

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
    public Road (int x, int y, boolean isThereRoad){
        this.coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;
        this.isThereRoad = isThereRoad;
    }

    public Road(int x, int y){
        this.coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;

        this.contained = null;
    }

    //getter methods
    
    public int totalCost(){
        return this.costFromStart + this.costToFinish;
    }

    public Road getParent(){
        return this.parent;
    }

    public int[] getCoords(){
        return this.coordinates;
    }

    public int getCostFromStart() {
        return costFromStart;
    }

    public int getCostToFinish() {
        return costToFinish;
    }

    public boolean getIsThereRoad(){
        return isThereRoad;
    }

    public Mobile getContained(){
        return contained;
    }

    public Building getEnterenceOf(){
        return entrenceOf;
    }
    
    //setter methods

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

    public void setCostFromStart(int costFromStart) {
        this.costFromStart = costFromStart;
    }

    public void setCostToFinish(int costToFinish) {
        this.costToFinish = costToFinish;
    }

    public void setParent(Road newParent){
        this.parent = newParent;
    }

    public void setRoad(boolean isThereRoad){
        this.isThereRoad = isThereRoad;
    }

    public void setContined(Mobile contained){
        this.contained = contained;
    }

    public void setEnteranceOf(Building build){
        this.entrenceOf = build;
    }
} 
