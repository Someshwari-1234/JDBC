import java.sql.*;

class JdbcExample {
    public static void main(String[] args) {
        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Establish connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "password");

            // 3. Create statement
            Statement stmt = con.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // 5. Process result
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
