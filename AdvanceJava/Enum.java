enum Status{
    Running , Faild , Pending , Success;
}

public class Enum {
    public static void main(String[] args) {
        
        Status[] sa = Status.values();
       
        for(Status s: sa){
            System.out.println(s.ordinal() + " " + s);
        }
    }
    
}
