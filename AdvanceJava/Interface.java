
interface Computer {
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println(" Laptop");
    }

    @Override
    public String toString() {
        return "Lapto";
    }
    
}

class Desktop implements Computer{
    public void code(){
        System.out.println(" Desktop");
    }

    @Override
    public String toString() {
        return "Desktop";
    }
    
}

class Developer{

    public void gadget(Computer g){
        System.out.println("Using " + g + " to code");
    }

    
}
    

public class Interface {
    public static void main(String[] args) {

        Laptop lap = new Laptop();

        Developer dev = new Developer();
        dev.gadget(lap);

       
    }
    
}
