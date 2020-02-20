package main;

import features.RegexFeature;
import user.Person;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList <Person> contactBook = new LinkedList<>();

        System.out.println("\n\n***WELCOME TO PRAFUL's CONTACT LIST PROGRAM!***\n\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program");
        int choice = scanner.nextInt();
        RegexFeature regexFeature = new RegexFeature();

        switch (choice) {
            case 1:
                System.out.println("enter the serial number.");
                int serialNumber = scanner.nextInt();

                System.out.println("enter the first name");
                String firstName = scanner.next();
                if (regexFeature.isFirstNameCorrect(firstName)){
                    System.out.println("enter the last name");
                    String lastName = scanner.next();

                    if (regexFeature.isLastNameCorrect(lastName)){
                        System.out.println("enter the email address");
                        String emailAddress = scanner.next();

                        if (regexFeature.isEmailCorrect(emailAddress)) {
                            System.out.println("enter the contact number.");
                            String phoneNumber = scanner.next().trim();

                            if (regexFeature.isPhoneNumberCorrect(phoneNumber)) {
                                System.out.println(regexFeature.isPhoneNumberCorrect(phoneNumber));
                                LinkedList<String> contacts = new LinkedList<>();
                                contacts.add(phoneNumber);
                                Person person = new Person(serialNumber, firstName, lastName, emailAddress, contacts);
                                contactBook.add(person);
                                System.out.println(contactBook);
                                break;

                            } else {
                                System.out.println("Sorry Wrong Syntax.");
                            }

                        } else {
                            System.out.println("Sorry Wrong Syntax.");
                        }
                    } else {
                        System.out.println("Sorry Wrong Syntax.");
                    }
                } else {
                    System.out.println("Sorry Wrong Syntax.");
                }


            case 2:
                System.out.println(contactBook);
                break;
            case 3:
                //searching operation coming soon..
            case 4:
                //deletion operation coming soon..
            case 5:
                //exit feature coming soon..
            default:
                System.out.println("please enter the valid option.");

        }

    }
}
