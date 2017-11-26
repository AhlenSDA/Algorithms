package Factorial;

import java.util.Scanner;

public class ByRecursion {

    public static void main(String[] args) {

        // recursion

        Scanner scanner = new Scanner(System.in);
        long n;

        do {

        System.out.print("Enter n!: ");
        n = scanner.nextInt();


            if (n < 0) {
                System.out.println("Value must be >= 2 ");
            } else
                System.out.println(n + "! = " + calculateFactorial(n) + "\n");

        } while (n != -1);
    }

    private static long calculateFactorial(long n) {

        if (n <= 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}


