import java.util.*; 
public class greeting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button == 1){
        System.out.println("hello");

    
    }
    else if(button == 2){
        System.out.println("namste");
    }else if(button == 3){
        System.out.println("Bonjuur");

    }else{
        System.out.println("Invalid Button");
    }
}
}