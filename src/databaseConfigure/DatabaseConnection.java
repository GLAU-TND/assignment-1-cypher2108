package databaseConfigure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection = null;

    private String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    private final String root = "root";
    private final String password = "";

    public boolean attemptConnection(){

        try {

            connection = DriverManager.getConnection(url, root, password);
            System.out.println("Connected.");
        } catch (SQLException e) {
            System.out.println("Error.");
        }
        return connection != null;
    }

    public static Connection getConnection() {
        return connection;
    }

    public void closeConnection(){
        try {
            connection.close();
            System.out.println("Disconnected.");
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}
