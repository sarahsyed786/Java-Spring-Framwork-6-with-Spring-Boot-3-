import  java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) {

//        import packages
//        load the driver
//        register driver
//        create connection
//        create statement
//        execute statement
//        process the result
//        close


        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "newjourney786";

//        READ OPERATION
//        String sql = "select * from student";

//      INSERT OPERATION
//        String sql = "insert into student values (6,'Jhon', 66)";


//      UPDATE OPERATION
//        String sql = "update student set smarks=80 where sid=4";

//       DELETE OPERATION
        String sql = "delete from student where sid = 4";


        try {
            Class.forName("org.postgresql.Driver");//can skip this,
        }catch (ClassNotFoundException e){
            System.out.println("Class not found"+e);
        }


        try {
            Connection con = DriverManager.getConnection(url, uname, pass);
            System.out.println("Connection Successful");
            Statement st = con.createStatement();

//            READ OPERATION
//            ResultSet rs = st.executeQuery(sql);
////            rs.next();
////            String name = rs.getString("smarks");
////            System.out.println("Marks of the student is " + name);
//
//            while(rs.next()){
//                System.out.print(rs.getInt(1) + " : ");
//                System.out.print(rs.getString(2) + " : ");
//                System.out.println(rs.getInt(3) );
//            }


//          INSERT OPEARTION
//            boolean status = st.execute(sql);
//            System.out.println(status);

//       UPDATE OPERATION same for DELETE OPEARTION
            st.execute(sql);

            con.close();
            System.out.println("Connection Closed");

        }catch (Exception e){
            System.out.println("Connection Error"+e);
        }


    }
}
