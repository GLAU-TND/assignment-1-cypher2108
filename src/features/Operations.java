package features;

import user.Person;

import java.util.LinkedList;
import java.util.Scanner;

public class Operations {

    LinkedList<Person> contactBook = new LinkedList<>();
    LinkedList<String> contacts = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    RegexFeature regexFeature = new RegexFeature();

    public void addNewContact() {
        System.out.println("You have chosen to add a new contact: \n");
        System.out.print("enter the first name: ");

        String firstName = scanner.next();
        if (regexFeature.isFirstNameCorrect(firstName)) {
            System.out.print("enter the last name: ");
            String lastName = scanner.next();

            if (regexFeature.isLastNameCorrect(lastName)) {
                System.out.print("enter the email address: ");
                String emailAddress = scanner.next();

                char character;
                do {
                    if (regexFeature.isEmailCorrect(emailAddress)) {
                        System.out.print("enter the contact number: ");
                        String phoneNumber = scanner.next().trim();

                        if (regexFeature.isPhoneNumberCorrect(phoneNumber)) {
                            contacts.add(phoneNumber);
                        } else {
                            System.out.println("Sorry Wrong Syntax.");
                        }
                    } else {
                        System.out.println("Sorry Wrong Syntax.");
                    }

                    System.out.println("Would you like to add another contact number? (y/n): ");
                    character = scanner.next().charAt(0);

                } while (character == 'y' || character == 'Y');
                Person person = new Person(firstName, lastName, emailAddress, contacts);
                contactBook.add(person);
                System.out.println(contactBook);
            } else {
                System.out.println("Sorry Wrong Syntax.");
            }
        } else {
            System.out.println("Sorry Wrong Syntax.");
        }
    }

    public void viewAllContacts() {
        //coming soon...
    }

    public void searchForContact() {
        //coming soon..
    }

    public void deleteContact() {
        //coming soon...
    }

}
