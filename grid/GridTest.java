package grid;

import java.util.ArrayList;
import java.util.List;

import entity.mobile.Mobile;
import entity.mobile.physcian.Nurses;
import entity.mobile.physcian.Vans;

public class GridTest {
    public static void main(String[] args) {

        City city = new City(10, 10);
        Mobile a = new Vans();
        city.setRoad(a, 10,1);
        Stationary b = new Stationary(9,9);
        city.buildCustomeStationary(9,9, 1,1, b);
        Stationary Z = new Stationary(3,2);
        city.buildCustomeStationary(3,2, 8,6, b);

        city.emptyRoad(9, 4);

        List<Road> d = city.findPath((Nurses)a, b);
        System.out.println(city.viewMap());
        System.out.println("a");
    }
}
