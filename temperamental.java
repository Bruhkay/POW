public class temperamental extends medicine {
    protected String name;

    
    temperamental(String name){
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
