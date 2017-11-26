package Algorithms_additionalExercises.LeapYear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;

        System.out.println("Is entered year a leap year?");

        do {
            System.out.print("Enter year: ");
            userInput = scanner.nextInt();
            boolean leapYear = (userInput % 400 == 0) || ((userInput % 4 == 0 && userInput % 100 != 0));

            if (leapYear) {
                System.out.println(userInput + " --> leap year\n");
            } else {
                System.out.println(userInput + " --> NOT a leap year\n");
            }
        } while (userInput != -1);
    }
}
