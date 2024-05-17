
//abstract class can both normal and abstract methods
abstract class Car{

//it is compulsory to hava abstract method in abstract class 
public abstract void drive();
}

class WagonR extends Car{

public void drive(){
        System.out.println("Driving...");

}
    
}


public class AbstractClass {
    public static void main(String[] args) {

        Car obj = new WagonR();//it is not possible to create object of abstract class. to make objects we can use concret class.
        obj.drive();
        
    }
}
