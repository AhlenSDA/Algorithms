public class Bubble {

    public static void main(String[] args) {

        int[] anArrayToSort = new int[]{2, 4, 1, 3, 5, 0, 10};

        Bubble.printAnArray(anArrayToSort);
        Bubble.bubbleSort(anArrayToSort);
        Bubble.printAnArray(anArrayToSort);
    }

    private static void bubbleSort(int[] arrayToBubbleSort) {

        int i = 0; // iterator for our loop (counter)
        int n = arrayToBubbleSort.length;

        while (i < n - 1) {
            boolean condition = (arrayToBubbleSort[i] > arrayToBubbleSort[i + 1]);
            for (int k = 0; k < n - 1; k++) {

                if (condition) {
                    swapArrayElements(arrayToBubbleSort, k, (k + 1));
                }
            }
            i++;
        }
    }

    // Print array values
    static void printAnArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
        System.out.println();
    }

    // Swap current and next element if condition is true
    private static void swapArrayElements(int[] swapArray, int element_1, int element_2) {

        int tempElement = swapArray[element_1];
        swapArray[element_1] = swapArray[element_2];
        swapArray[element_2] = tempElement;
    }
}


