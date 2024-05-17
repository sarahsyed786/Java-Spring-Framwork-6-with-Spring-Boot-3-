
 class Outer {

    public void printO() {
        System.out.println("in outer class");
    }

    class inner {
        public void printI() {
            System.out.println("in inner class");
        }
    }
}

abstract class AnonymousClass {
    public void printA() {
        System.out.println("in class ");
    }
}

public class InnerClass {
    public static void main(String[] args) {

        Outer objO = new Outer();
        objO.printO();

        Outer.inner objI = objO.new inner();
        objI.printI();

        AnonymousClass obj = new AnonymousClass() {
            public void printA() {
                System.out.println("in anonymous class ");
            }
        };


        obj.printA();
    }

}
