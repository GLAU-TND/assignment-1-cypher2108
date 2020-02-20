package main;

import user.Person;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList <Person> contactbook = new LinkedList<>();

        System.out.println("\n\n***WELCOME TO PRAFUL's CONTACT LIST PROGRAM!***\n\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("enter the serial number.");
                int serialNumber = scanner.nextInt();


                System.out.println("enter the first name");
                String firstName = scanner.next();
                String regexFirstName = "'/^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]+$/u'";
                Pattern patternFirstName = Pattern.compile(regexFirstName);
                Matcher matcherFirstName = patternFirstName.matcher(firstName);
                boolean isFirstNameCorrect = matcherFirstName.matches();


                System.out.println("enter the last name");
                String lastName = scanner.next();
                String regexLastName = "'/^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]+$/u'";
                Pattern patternLastName = Pattern.compile(regexLastName);
                Matcher matcherLastName = patternLastName.matcher(lastName);
                boolean isLastNameCorrect = matcherLastName.matches();


                System.out.println("enter the email address");
                String emailAddress = scanner.next();
                final String regexEmail = "([a-z0-9][-a-z0-9_\\+\\.]*[a-z0-9])@([a-z0-9][-a-z0-9\\.]*[a-z0-9]\\.(arpa|root|aero|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|net|org|pro|tel|travel|ac|ad|ae|af|ag|ai|al|am|an|ao|aq|ar|as|at|au|aw|ax|az|ba|bb|bd|be|bf|bg|bh|bi|bj|bm|bn|bo|br|bs|bt|bv|bw|by|bz|ca|cc|cd|cf|cg|ch|ci|ck|cl|cm|cn|co|cr|cu|cv|cx|cy|cz|de|dj|dk|dm|do|dz|ec|ee|eg|er|es|et|eu|fi|fj|fk|fm|fo|fr|ga|gb|gd|ge|gf|gg|gh|gi|gl|gm|gn|gp|gq|gr|gs|gt|gu|gw|gy|hk|hm|hn|hr|ht|hu|id|ie|il|im|in|io|iq|ir|is|it|je|jm|jo|jp|ke|kg|kh|ki|km|kn|kr|kw|ky|kz|la|lb|lc|li|lk|lr|ls|lt|lu|lv|ly|ma|mc|md|mg|mh|mk|ml|mm|mn|mo|mp|mq|mr|ms|mt|mu|mv|mw|mx|my|mz|na|nc|ne|nf|ng|ni|nl|no|np|nr|nu|nz|om|pa|pe|pf|pg|ph|pk|pl|pm|pn|pr|ps|pt|pw|py|qa|re|ro|ru|rw|sa|sb|sc|sd|se|sg|sh|si|sj|sk|sl|sm|sn|so|sr|st|su|sv|sy|sz|tc|td|tf|tg|th|tj|tk|tl|tm|tn|to|tp|tr|tt|tv|tw|tz|ua|ug|uk|um|us|uy|uz|va|vc|ve|vg|vi|vn|vu|wf|ws|ye|yt|yu|za|zm|zw)|([0-9]{1,3}\\.{3}[0-9]{1,3}))";
                Pattern patternEmail = Pattern.compile(regexEmail);
                Matcher matcherEmail = patternEmail.matcher(emailAddress);
                boolean isEmailCorrect = matcherEmail.matches();


                System.out.println("enter the contact number.");
                String phoneNumber = scanner.next().trim();
                String regexPhoneNumber = "((\\+*)((0[ -]+)*|(91 )*)(\\d{12}+|\\d{10}+))|\\d{5}([- ]*)\\d{6}";
                Pattern patternPhoneNumber = Pattern.compile(regexPhoneNumber);
                Matcher matcherPhoneNumber = patternPhoneNumber.matcher(phoneNumber);
                boolean isPhoneNumberCorrect = matcherPhoneNumber.matches();

                LinkedList<String> contacts = new LinkedList<>();
                contacts.add(phoneNumber);



                Person person = new Person(serialNumber, firstName, lastName, emailAddress, contacts);
                contactbook.add(person);
                break;
            case 2:
                System.out.println(contactbook);
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
