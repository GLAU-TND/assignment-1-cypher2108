package main;

import features.Operations;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("\n\n***WELCOME TO PRAFUL's CONTACT LIST PROGRAM!***\n\n");
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        char character;
        do {
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operations.addNewContact();
                    System.out.println(operations.getContactBook());
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
                    operations.exitProgram();
                    break;
                default:
                    System.out.println("please enter the valid option.");
                    break;
            }

            System.out.println("\nDo you want to continue (Type y or n) \n");
            character = scanner.next().charAt(0);
        } while (character == 'Y' || character == 'y');

        System.out.println("***THANK YOU COME AT ANYTIME***");
    }

}
