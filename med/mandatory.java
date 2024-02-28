package med;
public class mandatory extends medicine{
    protected String name ;

    public mandatory(String name){
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
