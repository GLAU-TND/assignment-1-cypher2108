package main;

import databaseConfigure.DatabaseConnection;
import features.Operations;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        DatabaseConnection connection = new DatabaseConnection();
        connection.attemptConnection();

        System.out.println("\n***WELCOME TO PRAFUL's CONTACT LIST PROGRAM!***\n");
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        boolean key = true;
        do {
            System.out.println("\nPress 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operations.addNewContact();
                    System.out.println("\n***Contact saved Successfully.***\n");
                    break;
                case 2:
                    operations.viewAllContacts();
                    break;
                case 3:
                    operations.searchForContact();
                    break;
                case 4:
                    operations.deleteContact();
                    break;
                case 5:
                    key = operations.exitProgram();
                    break;
                default:
                    System.out.println("\nplease enter the valid option.\n");

                    break;
            }

        } while (key);

        System.out.println("\n***THANK YOU ****" +
                "***COME AT ANYTIME***\n");
    }

}
