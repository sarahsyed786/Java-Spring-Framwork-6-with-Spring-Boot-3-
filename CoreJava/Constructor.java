
class Human{


    public Human(){ //default constructor
        System.out.println("A Live");
    }

    public Human(int age, String name){//parameterize constructor
        System.out.println(age +" "+ name);
    }
}


public class Constructor {
    public static void main(String[] args) {
     
        Human obj = new Human(20,"Jhon");

        Human obj1 = new Human(24 , "Kim");
        
    }
    
}
