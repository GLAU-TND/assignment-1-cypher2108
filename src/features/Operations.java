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
        System.out.println("-------- * -------- * -------- * --------\n");
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
        System.out.println("\n-------- * -------- * -------- * --------");
    }

    public void searchForContact() {
        LinkedList <Integer>temp = new LinkedList <>();
        int count = 0;
        System.out.print("You could search for a contact from their first names: ");
        String element = scanner.next();
        for (int i =0; i<contactBook.size(); i++) {
            if (element.equals(contactBook.get(i).getFirstName())) {
                count++;
                temp.add(i);
            }
        }
        System.out.println(count + " match found.");
        System.out.println("---Here are all your contacts that matched---\n" +
                "-------- * -------- * -------- * --------");
        for (int i = 0; i < temp.size(); i++) {
            if (i != 0){System.out.println("-------- * -------- * -------- * --------\n" +
                    "-------- * -------- * -------- * --------");}
            System.out.println("First Name: " + contactBook.get(temp.get(i)).getFirstName());
            System.out.println("Last  Name: " + contactBook.get(temp.get(i)).getLastName());
            System.out.println("Email Address: " + contactBook.get(temp.get(i)).getEmailAddress());
            System.out.print("contacts: ");
            contactBook.get(i).displayContacts();
            System.out.println();


        }
        System.out.println("-------- * -------- * -------- * --------\n");
    }

    public void deleteContact() {
        System.out.println("Here are all your contacts: ");
        for (int i = 0; i < contactBook.size(); i++) { System.out.println((i+1) + ". " + contactBook.get(i).getFirstName()); }
        System.out.print("Press the number against the contact to delete it: ");
        int choice = scanner.nextInt();
        System.out.println(contactBook.get(choice-1).getFirstName() + "'s contact deleted from the directory.");
        contactBook.remove(choice-1 );


    }

    public boolean exitProgram() {
        System.out.println("\nthank you for using my phone directory\n" +
                "have a good day!\n");
        return false;


        //coming soon..
    }

}
