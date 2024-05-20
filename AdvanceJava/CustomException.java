
class NewException extends Exception{
    public NewException(String string){
        super(string);
    }
}


public class CustomException {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 0;

        try{
            num2 = 19/num1;

            if(num2==0){
                throw new NewException("Something went wrong");
            }}
         catch (NewException e) {
               System.out.println("Default Answer" + e);
            }

        
    }
}
