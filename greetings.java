package com.company;

import java.util.Scanner;

public class greetings {

    public static void main(String[] args) {
        System.out.println("Hello, please enter your name");

        Scanner myScanner =  new Scanner(System.in);
        String name = myScanner.next();

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hello " + name);
        }
        else {
            System.out.println("Sorry name not recognised");
        }

    }
}
