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
        city.setRoad(a, 7,0);
        Stationary b = new Stationary(9,9);
        city.buildCustomeStationary(9,9, 1,1, b);     //We already passed the coordinates of stationary by using "b". Not need!!!!!!!!!!?
        Stationary Z = new Stationary(1,1);
        city.buildCustomeStationary(1,1, 9,6, b);

        int[] newTraffic = {10,12};
        city.getRoad(10, 5).setTraffic(newTraffic);


        List<Road> d = city.findPath((Nurses)a, b);
        System.out.println(city.viewMap(true));
        System.out.println("a"); // bu a neden acaba...gercek bir gizem -> map printinin gerçekten bittiğini anlamak için bence :)

        //Mutlulukkk a* a kurban olim
    }
}
