//You can specify as many attributes as you want:

public class multipleattribute {
    String fname = "john";
    String lname = "Doe";
    int age =24;

    public static void main(String []args){
        multipleattribute myObj = new multipleattribute();
        System.out.println("Name : "+ myObj.fname + " "+myObj.lname);;
System.out.println("Age "+ myObj.age);
    }
}
