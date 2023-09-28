import java.util.*;
public class pattern3 {
    public static void main(String args []){
     int n = 10;
     //outer loop
        for(int i=1; i<=n; i++){
        //innerloop -->space print
        for(int j= 1; j<=n-i; j++ ){
            System.out.print(" ");
        }
        //inner loop->star point 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
 