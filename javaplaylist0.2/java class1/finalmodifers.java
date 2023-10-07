
//The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.
//final->If you don't want the ability to override existing attribute values, declare attributes as final:

public class finalmodifers {
    final int x =10;
    final double PI =3.14;

    public static void main(String args[]){
        finalmodifers  myObj = new finalmodifers ();
        myObj.x = 50;  //will generate an error : cannot assigne a value to a final variable
        myObj.PI = 25; //will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
