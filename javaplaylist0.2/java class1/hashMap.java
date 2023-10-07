//Java HashMap->A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
import java.util.HashMap;

public class hashMap {
    public static void main(String args[]){

        //Create a HashMap object called capitalCities
        HashMap<String,String> capitalCities = new HashMap<String,String>();

          // Add keys and values (Country, City)
          capitalCities.put("England","London");
          capitalCities.put("Germany","Berlin");
          capitalCities.put("Norway","Oslo");
          capitalCities.put("USA","Washington DC");
          capitalCities.put("India","Delhi");
          System.out.println(capitalCities);
    }
}
