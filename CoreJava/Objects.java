
class Calculator{

    public int add(int n1, int n2){

        int r = n1+n2;
        return r;

    }
}


public class Objects {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        int result = obj.add(2,5);

        System.out.println(result);

    }
    
}
