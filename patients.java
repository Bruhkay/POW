public class patients extends stationary {
    protected String name;

    public patients(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
