import java.util.ArrayList;
import java.util.Collections;

public class sortarray {
    public static void main(String args []){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volov");
        cars.add("BMW");
        cars.add("RR");
        cars.add("MAZDA");
        cars.add("TESLA");
        Collections. sort(cars);
        for(String i :cars){
            System.out.println(i);
        }
    }
}
