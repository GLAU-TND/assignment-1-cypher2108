package main;

import user.Person;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("hello World.");
        Scanner scanner = new Scanner(System.in);
        int serialNumber = scanner.nextInt();
        String firstName = scanner.nextLine().trim();
        String lastName = scanner.nextLine().trim();
        String emailAddress = scanner.nextLine().trim();
        Person person = new Person()
    }
}
