package Factorial;

import java.util.Arrays;
import java.util.Scanner;

public class ByArray {

    public static void main(String[] args) {

        // IMPORTANT NOTES
        // n! = n * (n-1)!
        // 0! = 1

        Scanner scanner = new Scanner(System.in);

        int arrayValue = 0;
        int i;
        long factorial_for = 1;
        long factorial_foreach = 1;
        int arraySize;

        System.out.print("Enter n = ");
        arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];
        System.out.println("\n" + arraySize + "!");

        // fill array with values
        // System.out.println("\nLoop inserting values into array");
        for (i = 0; i < myArray.length; i++) {
            myArray[i] += arrayValue + 1;
            arrayValue++;
            //System.out.println("Index nr: [" + index + "] = " + myArray[index]);
        }

        // FOR EACH LOOP
        for (int value : myArray) {
            factorial_for *= value;
        }
        System.out.println("For each loop:\nFactorial = " + factorial_for);

        // FOR LOOP
        System.out.println("\nFor loop");
        for (i = 0; i < myArray.length; i++) {
            factorial_foreach *= i + 1;
            System.out.println("Index [" + i + "] value = " + myArray[i] + "! factorial = " + factorial_foreach);
        }

        System.out.println("\nFor loop:\nFactorial = " + factorial_foreach);
    }
}
