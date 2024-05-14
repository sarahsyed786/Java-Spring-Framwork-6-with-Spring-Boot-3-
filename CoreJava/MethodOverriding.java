class Calc{

    public int add(int n1, int n2){
        return n1+n2;
    }

}

class AdvCalc{

    public int add(int n1, int n2){
        return n1+n2+5;
    }
}



public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r = obj.add(5, 5);
        System.out.println(r);
    }
}
