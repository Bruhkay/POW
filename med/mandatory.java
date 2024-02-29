package med;
public class Mandatory extends Medicine{
    protected String name ;

    public Mandatory(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
