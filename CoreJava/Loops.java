public class Loops {
    public static void main(String[] args) {

        //WHILE LOOP
        int i =1;
        while(i<=4){
            System.out.println("While Loop");
            int j =1;
            while (j<=3) {
                System.out.println("Nested While Loop");
                j++;
            }
            i++; 
        }

        //DO WHILE LOOP
        do{
            System.out.println("Do While Loop");
            i++; 
        }while(i<=4);

        //FOR LOOP
        for(int j = 1; j<5; j++){
            System.out.println("For Loop");
        }

    } 
}
