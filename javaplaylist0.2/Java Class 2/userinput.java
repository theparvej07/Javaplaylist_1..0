//Java User Input->The Scanner class is used to get user input, and it is found in the java.util package.
import java.util.Scanner;;

public class userinput {
    public static void main(String args []){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username :-");

        String username = myObj.nextLine();
        System.out.println("Username is : "+ username);
    }
}
