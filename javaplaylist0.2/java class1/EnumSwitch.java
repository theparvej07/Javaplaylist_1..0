//Enum in a Switch Statement->Enums are often used in switch statements to check for corresponding values:

    enum Level{
        MEDIUM,
        LOW,
        HIGH    
        

    }
    public class EnumSwitch{
        public static void main(String args[]){
            Level myVar= Level.MEDIUM;
            switch(myVar){
                case LOW:
            System.out.println("LOW LEVEL");   
            break;
            case MEDIUM:
            System.out.println("medium level");
            break;
            case HIGH:
            System.out.println("High Level");
            break;
            }
        }
    }

