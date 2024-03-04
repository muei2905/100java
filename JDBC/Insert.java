package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "password";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = con.prepareStatement("INSERT INTO employees (name, email) VALUES (?, ?)")) {

            stmt.setString(1, "John Doe");
            stmt.setString(2, "john.doe@example.com");
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
