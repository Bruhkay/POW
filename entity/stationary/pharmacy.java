package entity.stationary;

import grid.Stationary;

public class Pharmacy extends Stationary {
    protected String name;
    public Pharmacy(String name, int x, int y){
        
        super(x, y);
        this.name = name; 
    }
}
