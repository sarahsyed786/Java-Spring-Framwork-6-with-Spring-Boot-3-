 class Calc{

    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public int sub(int n1, int n2)
    {
        return n1-n2;
    }

}

 class AdvCalc extends Calc {

    public int mlt(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1, int n2){
        return n1/n2;
    }

    
}

class VeryAdvCalc extends AdvCalc {

    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
    
}



public class Inheritance {
    public static void main(String[] args) {
        
        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 = obj.add(2, 2);
        int r2 = obj.sub(5, 1);
        int r3 = obj.mlt(2, 2);
        int r4 = obj.div(8, 2);
        int r5 = obj.add(2, 2);

        System.out.println("Addition: " 
        + r1 +" Subtraction: "+ r2 + " Multiplication: " + r3 + " Division: " + r4 + " Power: " + r5);
    }
}
