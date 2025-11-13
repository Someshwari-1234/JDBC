import java.sql.*;

public class PostgreSQLSelectExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/studentdb";
        String user = "postgres";
        String password = "12345";

        try {
            // 1. Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. Create statement
            Statement stmt = con.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // 5. Process result
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name"));
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
