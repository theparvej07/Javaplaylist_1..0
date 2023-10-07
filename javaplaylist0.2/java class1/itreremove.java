//The iterator() method can be used to get an Iterator for any collection:

import java.util.ArrayList;
import java.util.Iterator;

public class itreremove {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(56);
        numbers.add(67);
        numbers.add(57);
        numbers.add(100);
        numbers.add(9);
        numbers.add(18);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i<20){
                it.remove();

            }
        }
        System.out.println(numbers);
    }
}
