public class StringMutableUnmutable {
    public static void main(String[] args) {
        
        String name = "Sarah"; //By default Strings are unmutable, so this is unmutable
        System.out.println("Hellow" + name);

        //Stirng Buffer is mutable, means you can change it. It gives you the 16 bytes extra.

        StringBuffer sb = new StringBuffer("Sarah");
        sb.append(" Syed"); //this changes the string and add last name into the string.
        System.out.println(sb);  

        


    }
    
}
