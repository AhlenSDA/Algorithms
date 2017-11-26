package SimpleOne;

import java.util.Scanner;

public class AbsoluteValueCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double userInput = scanner.nextDouble();

        if (userInput < 0) {
            double absoluteValue = userInput * (-1);

            System.out.println("Value is negative! I need to do some calculation...");
            System.out.println("Absolute value = " + "[" + absoluteValue + "]");

        } else {
            System.out.println("Value is positive! No need to calculate anything.");
            System.out.println("Absolute value = " + "[" + userInput + "]");
        }
    }
}


