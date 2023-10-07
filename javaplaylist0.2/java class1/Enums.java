//Enums->An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
public class Enums {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String args []){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}
