import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.err.println("Enter a number");//println belongs to printstream class and out is the static object of system class

        InputStreamReader in = new InputStreamReader(System.in);


        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine()) ;


        System.out.println(num);
        bf.close();  

        
        

    }
    
}
