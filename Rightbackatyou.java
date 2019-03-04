package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rightbackatyou {
    public static void main(String[] args) {
        System.out.println("Please enter a list of numbers and type done when finished");
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Integer> mylist = new ArrayList<>();
        while (myScanner.hasNextInt()) {
            int i = myScanner.nextInt();
            mylist.add(i);

        }

        Collections.reverse(mylist);
        System.out.println(mylist);


        /*int number = 2;
        String input = "Y";
        while (input.equalsIgnoreCase("Y")) {
            System.out.println(number + "");
            System.out.print("do you want to keep counting?" + "(Y or N)");
            input = myScanner.next();
            number += 2;
        }
        System.out.println("\nWhew! That was close.");*/

    }

        }


