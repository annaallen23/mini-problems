package com.company;

import java.util.Scanner;

public class Leapingforjoy {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int numberOfResponses = 0;
        for (int year=2019; numberOfResponses < n; year++){
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))  {
                numberOfResponses = numberOfResponses+1;
                System.out.println(year);
            }
        }
    }
}

