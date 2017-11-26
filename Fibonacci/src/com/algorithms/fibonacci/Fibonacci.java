package com.algorithms.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        short n;
        System.out.println("---- com.algorithms.fibonacci.Fibonacci ----");
        do {
            System.out.print("Enter f(n): ");
            n = scanner.nextShort();

            if (n == 0) {
                System.out.println(("f(" + n + ") = " + 0));
                System.out.println();
            } else if (n <= 2) {
                System.out.println(("f(" + n + ") = " + 1));
                System.out.println();
            } else {
                System.out.println("f(" + n + ") = "
                        + "f(" + (n - 2) + ")" + " + "
                        + "f(" + (n - 1) + ")");
                System.out.println("f(" + n + ") = "
                        + (getFibonacci(n - 2)) + " + "
                        + (getFibonacci(n - 1)));
                System.out.println("f(" + n + ") = " + getFibonacci(n));
                System.out.println();
            }
        } while (n != (-1));
    }

    private static long getFibonacci(long n) {
        long fibonacci;

        if (n <= 2) {
            return 1;
        } else {
            fibonacci = (getFibonacci((n - 2)) + (getFibonacci((n - 1))));
            return fibonacci;
        }
    }
}


