public class Conditions {
    public static void main(String[] args) {
        int x = 8;

        if( x < 10 || x>0){ 

        System.out.println("Hellow");

        } else{
        System.out.println("TTYL");
        }

        //Ternary Operator 

        int n = 6;

        int result = 0;

        result = n%2==0 ? 10 : 20; // if the given conditon is true result=10 if not than result=20
        System.out.println(result);



    }
}
