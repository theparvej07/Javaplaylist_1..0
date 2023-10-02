//With method overloading, multiple methods can have the same name with different parameters:

public class overloading1 {
   static int plusMethodInt(int x, int y){
    return x + y;
   } 
   static double plusMethodDouble(double x, double y){
    return x + y;
   }
   public static void main(String args []){
    int myName1 = plusMethodInt(6, 8);
    double myName2 = plusMethodDouble(4.3, 6.26);
    System.out.println("int : "+ myName1);
    System.out.println("double : "+ myName2);
   }
}
