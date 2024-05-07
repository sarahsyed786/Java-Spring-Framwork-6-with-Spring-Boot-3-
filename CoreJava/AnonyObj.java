class Copmuter{

    public void Computer(){
        System.out.println("Object Created!");
    }

    public void showDetails(){
        System.out.println("In shoeDetails Method.");
    }
}


public class AnonyObj {
    public static void main(String[] args) {

        new Copmuter().showDetails(); // this is anonymus object , we use this only once.

        

    }
    
}
