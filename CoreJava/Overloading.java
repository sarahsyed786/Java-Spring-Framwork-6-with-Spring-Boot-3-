//same name but different parameters is called overloading.

class Calculator{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }

    public int add(int n1, int n2, int n3)
    {
        int r2 = n1 + n2 + n3;
        return r2;
    }
}


public class Overloading {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println(obj.add(2,5));

        System.err.println(obj.add(2,2,2));
        
    }
}
