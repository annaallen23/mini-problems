package com.company;


import java.util.Scanner;

public class Seeingdouble {
    public static void main(String[] args) {
        String original, reverse = ""; //objects of String class
        System.out.println("Enter a string to check if it is a palindrome");
        Scanner myScanner = new Scanner(System.in);

        original = myScanner.nextLine();

        int length = original.length();

        for (int i = length -1; i>= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string isn't a palindrome.");


    }


    }


