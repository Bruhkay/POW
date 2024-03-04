package grid;

import entity.mobile.Mobile;
import entity.mobile.physcian.Vans;

public class GridTest {
    public static void main(String[] args) {

        City city = new City(10, 10);
        Mobile a = new Vans();
        city.setRoad(a, 0,1);
        Stationary b = new Stationary(1, 1);
        city.buildCustomeStationary(1 ,1 , 3, 3, b);

        System.out.println(city.viewMap());
        System.out.println("a");
    }
}
