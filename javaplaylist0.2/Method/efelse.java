

public class efelse {

    //Create a checkAge() method with an integer variable called age
    static void checkAge(int age){
        // If age is less than 18, print "access denied"
        if(age < 18){
            System.out.println("Access Denied  -- You are not eligible!");
            // If age is greater than, or equal to, 18, print "access granted"
        }
        else{
            System.out.println("Access granted  -- You are eligible!");

        }
    }
    public static void main(String args[]){
         // Call the checkAge method and pass along an age of 20
  

        checkAge(20);
    }
     
}

