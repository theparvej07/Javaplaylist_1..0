//You can create multiple objects of one class:

public class multipleobject {
   int x = 6;
   public static void main(String [] args){
    multipleobject myObj1 = new multipleobject();//object 1
    multipleobject myObj2 = new multipleobject();//object 2
    multipleobject myObj3 = new multipleobject();//object 3
    multipleobject myObj4 = new multipleobject();//object 4
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
    System.out.println(myObj3.x);
    System.out.println(myObj4.x);
   }

}
