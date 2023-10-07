import java.util.Scanner;

public class userinput1 {
    public static void main (String args[]){
      Scanner myObj = new Scanner (System.in);
      
      System.out.print("Enter Name: ");
      
      //String inputt

      String name = myObj.nextLine();
 System.out.print("Enter Age: ");
      //numerical input

      int age = myObj.nextInt();
       System.out.print("Enter Salary: ");
      double salary = myObj.nextDouble();

      //output input by user

      System.out.println("Name: "+ name);
      System.out.println("Age :"+age);
      System.out.println("Slary:"+salary);
    }
}
