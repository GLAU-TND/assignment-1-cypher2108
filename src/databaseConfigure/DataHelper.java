package databaseConfigure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataHelper {
    PreparedStatement preparedStatement;

    public void insert(Connection connection, String firstName, String lastName, String emailAddress) {

        try {
            preparedStatement = connection.prepareStatement("INSERT into phonebook(First_Name, Last_Name, Email_Address) VALUES (?, ?, ?);");
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, emailAddress);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }

    public void delete(Connection connection, String firstName) {
        try {
            preparedStatement=connection.prepareStatement("delete from phonebook where First_Name=?;");
            preparedStatement.setString(1,firstName);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }
}