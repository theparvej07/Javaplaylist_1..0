class OuterClass{
    int x = 10;

    static class InnerClass1{
        int y = 5;
    }
}
public class InnerClass1{
    public  static void main(String args[]){

OuterClass.InnerClass1 myInner = new OuterClass.InnerClass1();
System.out.println(myInner.y);
    }
}