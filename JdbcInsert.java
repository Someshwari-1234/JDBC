import java.sql.*;

public class JdbcInsert {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/studentdb";
        String user = "postgres";
        String pass = "12345";

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, 1);
            pst.setString(2, "Ram");
            pst.setInt(3, 21);

            pst.executeUpdate();
            System.out.println("Record Inserted Successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
