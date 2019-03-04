package com.company;

import sun.jvm.hotspot.tools.FinalizerInfo;

import java.util.Scanner;

public class Summingup {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int total = 0;
        {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    total = total + i;
                }
            }
        }
        System.out.println(total);
        {
            while (!myScanner.hasNextInt()) {
                System.out.println("That's not a valid number try again");
            break;
            }

        }
        }


        }







