import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int userInput_PerfectNumber;
        userInput_PerfectNumber = scanner.nextInt();

        int sumOfModulo = 0;
        for (int i = 1; i <= userInput_PerfectNumber / 2; i++) {
            if (userInput_PerfectNumber % i == 0) {
                sumOfModulo += i;
            }
        }

        if (userInput_PerfectNumber == sumOfModulo) {
            System.out.println("Perferct number");
        } else {
            System.out.println("Not perfect");
        }
    }
}
