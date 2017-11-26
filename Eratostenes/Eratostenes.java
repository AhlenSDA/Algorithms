public class Eratostenes {

    public static void main(String[] args) {

        int[] arrayN = Helper.getArrayFromUserBySzie();

        Helper.printArray(arrayN);
        System.out.println();
        arrayN = doEratostenesNWD(arrayN);
        Helper.printArray(arrayN);
    }

    public static int[] doEratostenesNWD(int[] arrayN) {

        int sqrt = (int) Math.floor(Math.sqrt(arrayN[arrayN.length - 1]));

        for (int i = 0; i < arrayN.length - 1; i++) {
            for (int j = i + 1; j < arrayN.length - 1; j++) {
                if (arrayN[i] != 0 && arrayN[j] != 0 && arrayN[i] % arrayN[j] == 0) {
                    arrayN[j] = 0;
                }
            }
            if (arrayN[i] > sqrt) {
                break;
            }
        }
        return arrayN;
    }
}
