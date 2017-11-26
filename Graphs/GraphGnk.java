package Graphs;

public class GraphGnk {

    public static Edge[] generateGnk(int n, int k) { // tablica typow Edge!!!

        Edge[] result = Structures.generateEdgeArray(n);

        int h = n * (n-1)/2;

        if (k <= h) {
            for (int i = 0; i < k; i++) {
                int random = (int)(Math.random()*h); // floor zaokragla w dol
                Edge temp = result[random];
                result [random] = result[h-1];
                result [h-1] = temp;
                h--;
            }

            // k - liczba losowan
            // h - ostatni element

        }
        return result;
    }
}