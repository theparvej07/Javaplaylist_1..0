//Getting an Iterator->The iterator() method can be used to get an Iterator for any collection:

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String args[]){
        
        //make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volovo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("MAzada");

        //get the iterator
        Iterator<String> it = cars.iterator();

        //print the first item

        System.out.println(it.next());
    }
}
