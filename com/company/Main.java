package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");

        System.out.println("Enter the first name(first letter should be capital)");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String regex = "^[A-Z][a-z]{3,}$";
        System.out.println(firstName.matches(regex));

        System.out.println("Enter the last name(first letter should be capital)");
        String lastName = scanner.next();
        String regexLastName = "^[A-Z][a-z]{3,}$";
        System.out.println(lastName.matches(regexLastName));
    }
}
