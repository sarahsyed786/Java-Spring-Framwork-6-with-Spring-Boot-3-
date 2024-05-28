import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comapare {

    public static void main(String[] args) {
        //comparator is where you can specify your own logic for sorting 

        Comparator<Integer> intCom  = ( i,  j)-> i%10 > j%10 ? 1 : -1;
            
        List<Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(32);
        nums.add(29);
        nums.add(91);
        nums.add(10);
 
        Collections.sort(nums,intCom);
        System.out.println(nums);


        Comparator<String> strCom = ( s1,  s2) ->  Integer.compare(s1.length(), s2.length());
            
        List<String> str = new ArrayList<>();
        str.add("Apple");
        str.add("Mango");
        str.add("Banana");
        str.add("Orange");
        str.add("Pineapple");

        Collections.sort(str,strCom);
        System.out.println(str);

    }
    
}
