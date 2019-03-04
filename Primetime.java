package com.company;

import java.util.Scanner;

public class Primetime {
    public static void main(String[] args) {
        System.out.println("Please enter a number");

        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        for (int i=2; i<num;i++){
            if(Primetime.isPrime(i)) {
                System.out.println(i);
            }
        }

        if (isPrime(num))
                System.out.println(num + " is a Prime Number");

       else{
       System.out.println(num + " is not a Prime Number");
        }
        }


    private static boolean isPrime(int number) {
        for (int prime = 2; prime <= Math.sqrt(number); prime++) {
            int temp = number % prime;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }


    }




