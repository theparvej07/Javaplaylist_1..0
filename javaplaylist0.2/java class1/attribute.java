//In the previous chapter, we used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class:

public class attribute {
    int x = 5;
    public static void main(String []args){
        attribute myObj = new attribute();
        System.out.println(myObj.x);
    }
}
