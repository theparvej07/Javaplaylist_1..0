//A constructor in Java is a special method that is used to initialize objects.
//create main class
public class javaconstructors {
    int x;  //create a class attribute

    //create a class constructor for the main calss

    public javaconstructors(){
         x= 5; //set the initial value for the class attribute
    }
    public static void main(String args[]){
        javaconstructors myObj = new javaconstructors(); //create an object of class main ( this will call the constructor)
        System.out.println(myObj.x); //print the value of x
    }
}
