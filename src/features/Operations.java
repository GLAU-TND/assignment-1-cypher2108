package features;

import user.Person;

import java.util.LinkedList;
import java.util.Scanner;

public class Operations {
    Scanner scanner = new Scanner(System.in);
    RegexFeature regexFeature = new RegexFeature();

    LinkedList<Person> contactBook = new LinkedList<>();


    public void addNewContact() {
        LinkedList<String> contacts = new LinkedList<>();
        System.out.println("You have chosen to add a new contact: \n");

        System.out.print("enter the first name: ");
        String firstName = scanner.next();
        if (regexFeature.isFirstNameCorrect(firstName)) {

            System.out.print("enter the last name: ");
            String lastName = scanner.next();
            if (regexFeature.isLastNameCorrect(lastName)) {

                System.out.print("enter the email address: ");
                String emailAddress = scanner.next();
                if (regexFeature.isEmailCorrect(emailAddress)) {
                    char character;
                    do {
                        System.out.print("enter the contact number: ");
                        String phoneNumber = scanner.next().trim();
                        if (regexFeature.isPhoneNumberCorrect(phoneNumber)) {
                            contacts.add(phoneNumber);
                        } else {
                            System.out.println("Sorry Wrong Syntax.");
                            break;
                        }
                        System.out.print("Would you like to add another contact number? (y/n): ");
                        character = scanner.next().charAt(0);
                    } while (character == 'y' || character == 'Y');
                }

                else {System.out.println("Sorry Wrong Syntax.");}

                Person person = new Person(firstName, lastName, emailAddress, contacts);
                contactBook.add(person);

            } else {System.out.println("Sorry Wrong Syntax.");}
        }
        else {System.out.println("Sorry Wrong Syntax.");}
    }

    public void viewAllContacts() {
        System.out.println("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------");
        if (contactBook.size() == 0){
            System.out.println("**----**Empty**-----**");
        }
        for (int i = 0; i < contactBook.size(); i++) {
            if (i != 0){
                System.out.println("-------- * -------- * -------- * --------\n" +
                        "-------- * -------- * -------- * --------");
            }

            System.out.println("First Name: " + contactBook.get(i).getFirstName());
            System.out.println("Last  Name: " + contactBook.get(i).getLastName());
            System.out.println("Email Address: " + contactBook.get(i).getEmailAddress());
            System.out.print("contacts: ");
            contactBook.get(i).displayContacts();
            System.out.println();
        }
        System.out.println("-------- * -------- * -------- * --------\n");
    }

    public void searchForContact() {
        //coming soon..
    }

    public void deleteContact() {
        //coming soon...
    }

    public void exitProgram() {
        //coming soon..
    }

}
