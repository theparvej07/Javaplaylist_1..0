//Java Exceptions->When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things

//When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

public class Exception {
    public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
 
 
