//In Java, variables are only accessible inside the region they are created. This is called scope.


public class scope {
  public static void main(String[] args) {

    // Code here cannot use x

    int x = 100;

    // Code here can use x
    System.out.println(x);
  }
}
