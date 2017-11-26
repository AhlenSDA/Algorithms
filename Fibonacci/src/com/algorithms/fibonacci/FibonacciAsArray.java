package com.algorithms.fibonacci;

import java.util.Scanner;

public class FibonacciAsArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        short n;

        System.out.println("---- com.algorithms.fibonacci.Fibonacci ----");

        // for n = 50 application execute around 79 sec long
        // for n = 50 application execute around test??? long
        // for n = 55 application execute around 879.87 sec long

        System.out.print("Enter f(n): ");
        n = scanner.nextShort();
        long[] fibonacciArray = new long[n];

        long startTime = System.nanoTime();
        for (int i = 0; i < fibonacciArray.length; i++) {

            fibonacciArray[i] = getFibonacci(n - i);
            System.out.println("f[" + (n - i) + "] = " + fibonacciArray[i]);
        }
        long endTime = System.nanoTime();
        double executionTime = ((double) (endTime - startTime) / 1000000000);
        System.out.printf("Application execution time [s] = %.2f", executionTime);
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




