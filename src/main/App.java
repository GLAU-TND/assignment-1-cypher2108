package main;

import user.Person;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("hello World.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the serial number.");
        int serialNumber = scanner.nextInt();
        System.out.println("enter the first name");
        String firstName = scanner.next();
        System.out.println("enter the last name");
        String lastName = scanner.next();
        System.out.println("enter the email address");
        String emailAddress = scanner.next();
        System.out.println("enter the contact number.");
        LinkedList<String> contacts = new LinkedList<>();
        contacts.add(scanner.next());

        Person person = new Person(serialNumber, firstName, lastName, emailAddress, contacts);
        System.out.println(person);
    }
}
