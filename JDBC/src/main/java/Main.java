import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(jdbcDriver);
            System.out.println("Driver loaded successfully.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load JDBC driver.", e);
        }
    }
}
