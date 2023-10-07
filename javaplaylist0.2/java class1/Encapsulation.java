//Encapsulation->The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

public class Encapsulation{
    private String name ;//private = restricated access

    //Getter
    public String getName(){
        return name;
    }
    // setter
    public void setName(String newName){
        this.name = newName;
    }
}