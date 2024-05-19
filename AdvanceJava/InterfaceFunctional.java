@FunctionalInterface
interface A{
    int show(int i, int j);
}


public class InterfaceFunctional {
    public static void main(String[] args) {

        A obj = (i,j) ->  i+j;//lambda expression only works with functional interface ss

        obj.show(5,5);
        
    }
    
}
