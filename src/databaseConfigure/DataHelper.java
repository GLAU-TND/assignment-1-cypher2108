package databaseConfigure;

import java.sql.*;

public class DataHelper {
    PreparedStatement preparedStatement;
    ResultSet resultSets;

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

    public void showData(Connection connection) {
        try
        {
            preparedStatement =connection.prepareStatement("select * from phonebook;");
            resultSets= preparedStatement.executeQuery();
            while(resultSets.next())
            {
                String firstName=resultSets.getString(1);
                String lastName=resultSets.getString(2);
                String emailAddress=resultSets.getString(3);

                System.out.println(String.format("|%-30s|%-30s|%-30s|",firstName, lastName, emailAddress));
            }

        }
        catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    }
}