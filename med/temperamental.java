
package med;
import entity.*;
public class Temperamental extends medicine {
    protected String name;
    protected int ID = 0;

    

    
    public temperamental(String name){
        this.name = name;
        this.ID = super.ID;
        super.ID++;
    }
    
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return this.name + this.ID;
    }
    

}