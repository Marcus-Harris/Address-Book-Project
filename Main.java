package com.tts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose what you'd like to do with the database: ");
        int userDecision = scanner.nextInt();

        int i = 1;
        int myId = i;



        switch (userDecision) {
            case 1:
                System.out.println("Enter your first name.");
                String firstName = scanner.next();

                System.out.println("Enter your last name.");
                String lastName = scanner.next();

                System.out.println("Enter your phone number.");
                int phoneNumber = scanner.nextInt();

                System.out.println("Enter your email address.");
                String emailAddress = scanner.next();

                new Add(myId, firstName, lastName, phoneNumber, emailAddress);
                System.out.println("Your entry has been added");
                break;

            case 2:
                // new Remove();
                break;

            case 3:
                // new Search();
                break;
            case 4:
                // new Print();
                break;
            case 5:
                // new DeleteBook();
                break;

            case 6:
                // new QuitProgram();
                break;

            default:
                System.out.println("Please choose a number between 1 and 6 (inclusive).");
                main(new String[0]);
        }
    }
}
