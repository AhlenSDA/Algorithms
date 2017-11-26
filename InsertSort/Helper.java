import java.util.Arrays;
import java.util.Scanner;

public class Helper {

    public static int[] getArrayFromUser() {

        System.out.print("Podaj wielkosc tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrayN = new int[n];

        System.out.println("Podaj liczby do posortowania:");
        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = scanner.nextInt();
        }
        return arrayN;
    }

    public static void printArray(int[] arrayN) {
        System.out.print(Arrays.toString(arrayN));
    }

    public static int[] getArrayFromUserBySzie() {
        System.out.print("Podaj wielkosc tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrayN = new int[n - 1];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = i + 2;
        }
        return arrayN;
    }

    public static String getStringFromUser(String info) {

        System.out.println(info);
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    public static void printInt (int n) {
        System.out.println(n);
    }

    public static void printString(String text) {
        System.out.println(text);
    }

}
