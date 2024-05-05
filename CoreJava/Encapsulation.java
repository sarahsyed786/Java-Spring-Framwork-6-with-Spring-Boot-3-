

class Student {
    private int id;
    private String name;

    public Student(){
        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id; //this is a keyword which represents the current object, which is calling the method.
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
public class Encapsulation {
    public static void main(String[] args) {
     
        Student stu1 =  new Student();
        stu1.setId(101);
        stu1.setName("Jhon");
        System.out.println(stu1.getId()+" "+stu1.getName());

        Student stu2 =  new Student();
        stu2.setId(102);
        stu2.setName("Reddy");
        System.out.println(stu2.getId()+" "+stu2.getName());

        
    } 
    
}
