final class A{ // final class stops inheritence 

    public void func(){
        System.out.println("in A class.");
    }
}



public class FinalKeyword {
    public static void main(String[] args) {
        final int num =  8; // we can not change the value of final variables. ( making constant )
        System.out.println(num);

        A obj = new A();
        obj.func();
    }
    
}
