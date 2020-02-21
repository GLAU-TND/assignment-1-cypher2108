package user;

import java.util.LinkedList;

public class Person {
    // a field to store the first name
    // a field to store the last name
    // a list to store multiple contact numbers (i.e a list of numbers)
    // a field to store the email address of the person

    private String firstName;
    private String lastName;
    private String emailAddress;
    private LinkedList<String> contacts;

    //constructor
    public Person(String firstName, String lastName, String emailAddress, LinkedList<String> contacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "\n" + firstName + " " + lastName + "\n" + emailAddress + "\n" + contacts + "\n";
    }
}

