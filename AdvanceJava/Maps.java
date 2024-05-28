import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Jhonn", 45);
        students.put("Alex", 85);
        students.put("Harsh", 51);
        students.put("Chandlar", 78);
        students.put("Aliza", 91);
        //kesys are unique, values can be repeated.
        
        for(String key : students.keySet()){

            System.out.println(key + " : " + students.get(key));
        }

    }
}
