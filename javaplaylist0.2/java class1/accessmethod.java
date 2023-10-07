//create main class
public class accessmethod {
    
    //create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");

    }
    // create a speed () method and add a prameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is :" + maxSpeed);
    }
    // inside main , call the method on the myCar object
    public static void main(String [] args){
      accessmethod myCar = new accessmethod();
      myCar. fullThrottle();
      myCar.speed(200); 
    }
}
