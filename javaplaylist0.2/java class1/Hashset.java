//Java HashSet->A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

import java.util.HashSet;

public class Hashset {
   public static void main(String args[]){
    HashSet<String> Cars = new HashSet<String>();
    Cars.add("Volovo");
    Cars.add("Rang Rover");
    Cars.add("BMW");
    Cars.add("Ford");
    Cars.add("MAzada");
    System.out.println(Cars);
   } 
}
