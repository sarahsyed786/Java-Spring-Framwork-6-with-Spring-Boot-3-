public class TypeConv {
    public static void main(String[] args) {
        
        //you can change type just by doing type conversion. 
        
        int b = 127;
        byte a = (byte) b;

        float f = 3.14f;
        int n = (int) f;  //out put will be 3 because int can not hold floating point number so that it drops all the digits after point. 

        System.out.println(a);


        
    }
    
}
