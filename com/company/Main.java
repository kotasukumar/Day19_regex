package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter the first name(first letter should be capital)");
        String firstName = scanner.next();
        String regex = "^[A-Z][a-z]{3,}$";
        System.out.println(firstName.matches(regex));

        System.out.println("Enter the last name(first letter should be capital)");
        String lastName = scanner.next();
        String regexLastName = "^[A-Z][a-z]{3,}$";
        System.out.println(lastName.matches(regexLastName));

        System.out.println("Enter a valid email id(eg: abc.xyz@bl.co.in)");
        String emailID = scanner.next();
        String regexEmailID = "^[\\w]+(?:\\.[\\w]+)*@[\\w]+(?:\\.[\\w]+)*$";
        System.out.println(emailID.matches(regexEmailID));

        System.out.println("Enter a valid mobile number");
        String mobileNumber = scanner.next();
        String regexMobileNumber = "^91[ ][\\d]{10}$";
        System.out.println(mobileNumber.matches(regexMobileNumber));*/

        System.out.println("Enter a password");
        String password = scanner.next();
        String regexPassword = "[\\w([A-Z]{1,0})]{8,}";
        System.out.println(password.matches(regexPassword));
    }
}
