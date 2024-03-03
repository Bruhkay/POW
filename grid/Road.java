package grid;

import java.util.*;

import org.w3c.dom.Node;

import entity.mobile.Mobile;
import entity.stationary.Stationary;

public class Road {
    
    int[] coordinates;
    // maybe ArrayList for more complicated city arrangements in the future
    // though that would require a rework of a* which is not easy
    Stationary[] surroundingStationarys;
    Mobile contained = null;                                                //its abstract!!!   
    int costFromStart; // Cost from start node to current node
    int costToFinish; // Heuristic (estimated cost from current node to goal node)
    Road parent; 
    Stationary entrenceOf;
    boolean isThereRoad; //if there is no road there might be a stationary

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

    public Stationary getEnterenceOf(){
        return entrenceOf;
    }
    
    //setter methods

    public void setSurroundings(Stationary[] stationarys){
        this.surroundingStationarys = stationarys;
    }

    public void setSurroundings(Stationary stationary1, Stationary stationary2, Stationary stationary3, Stationary stationary4){
        this.surroundingStationarys = new Stationary[4];

        this.surroundingStationarys[0] = stationary1;
        this.surroundingStationarys[1] = stationary2;
        this.surroundingStationarys[2] = stationary3;
        this.surroundingStationarys[3] = stationary4;
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

    public void setEnteranceOf(Stationary build){
        this.entrenceOf = build;
    }
} 
