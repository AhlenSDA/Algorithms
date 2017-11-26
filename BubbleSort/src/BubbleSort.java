

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arrayN = Helper.getArrayFromUser();
        doBubbleSort(arrayN);
        Helper.printArray(arrayN);
    }

    public static int[] doBubbleSort(int[] arrayN) {

        int n = arrayN.length;
        if (n > 1) {

            boolean zmiana = true;
            while (zmiana) {
                for (int i = n - 1; i > 0; i--) {
                    zmiana = false;
                    if (arrayN[i] < arrayN[i - 1]) {
                        int temp = arrayN[i];
                        arrayN[i] = arrayN[i - 1];
                        arrayN[i - 1] = temp;
                        zmiana = true;
                        // nie ma mozliwosci wykonania zmiany elementow na raz, dlatego musimy wprowadzic zmienna
                        // tymaczasowa ktora umozliwi nam takowa zmiane
                    }
                }
            }
        }
        return arrayN;
    }
}
