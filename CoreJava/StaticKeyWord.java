
class Mobile {
    String brand;
    int price;
    static String type;

    static{ //static block is use to innitialize the static variables

        type = "Android";

    }

    public void printDetails(){
        System.out.println("Name: " + brand + " Price: " + price + "  Type: " + type);
    }

}

public class StaticKeyWord{
    public static void main(String[] args) {
        //static variable is commmon for all the objects 

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 50_000;
        obj1.printDetails();

        Mobile obj2 = new Mobile();
        obj2.brand = " Infinix";
        obj2.price= 66_000;
        obj2.printDetails();

    }
    
}

