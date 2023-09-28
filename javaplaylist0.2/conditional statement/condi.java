import java.util.*;
public class condi {
    private static String[] args;

    public static void main(String args[]){
        condi.args = args;
        Scanner sc =new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2:System.out.println("bonjour");
            break;
            case 3: System.out.println("Good Moring");
            break;
            default : System.out.println("invalid button");
        }
    }
    
}
