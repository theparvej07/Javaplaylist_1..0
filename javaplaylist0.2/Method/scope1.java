//A block of code refers to all of the code between curly braces {}.

public class scope1 {
    public static void main(String []args){
        //Code here CONNTO use x

        {//this is the block
            //code here canot use x
            int x = 100;
            //code here CAN use x
            System.out.println(x);

        }//this block ends here
    }
}
