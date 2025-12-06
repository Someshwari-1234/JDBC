import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Load driver

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "root"
            );

            System.out.println("Connection Successful!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
