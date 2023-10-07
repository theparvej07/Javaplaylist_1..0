//You will often see Java programs that have either static or public attributes and methods.

public class staticpublic {
    //static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");

    }
    //public method
    public  void myPublicMethod(){
       System.out.println("Public methods must be called by creating objects");
}
//Mian method
public static void main (String args []){
    myStaticMethod(); //call the static method
    // my public method(); this would compile an error

    staticpublic myObj = new staticpublic(); //create an object of main
    myObj.myPublicMethod(); //call the public method on the object
}
}