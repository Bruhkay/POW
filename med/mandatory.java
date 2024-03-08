/**
 * This is a mandotory class
 * Periodic patients use mandatoey pills.
 * They are re-prescribed in 3 months and purchased by the patient regulary.
 *                                                                                              Scooters(?) will cater those pills.?????
 * 
 */
package med;
public class Mandatory extends Medicine{
    protected String name ;
    protected int ID;

    public Mandatory(String name){
        this.name = name;
        this.ID = super.ID;
        super.ID++;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return this.name+ "" + this.ID;
    }
}
