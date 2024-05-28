import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class Sets {
    public static void main(String[] args) {
        Set<Integer> num = new  
        TreeSet<Integer>();

        num.add(2);
        num.add(7);
        num.add(3);
        num.add(5);

        Iterator<Integer> values =  num.iterator();
        
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
