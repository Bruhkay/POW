package grid;

public class GridTest {
    public static void main(String[] args) {

        City city = new City(5, 6);
        city.setRoad(null, 2,2);
        System.out.println(city.viewMap());
        System.out.println("a");
    }
}