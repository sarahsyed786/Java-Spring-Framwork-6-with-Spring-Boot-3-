import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        
        List<Integer> nums =  new ArrayList<Integer>();

        nums.add(4);
        nums.add(9);
        nums.add(2);
        nums.add(6);

        for(Object n : nums){

            int num = (Integer)n;
            System.out.println(num+2);
        }



    }
    
}
