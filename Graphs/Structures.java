package Graphs;

public class Structures {

    public static Edge[] generateEdgeArray(int n) {

        int h = n * (n - 1) / 2; // ostatnia krawedz
        Edge[] result = new Edge[h];
        int index = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Edge newEdge = new Edge(i, j); // korzystamy z drugiego konstruktora
                result[index] = newEdge;
                index++;
            }
        }
        return result;
    }

    public static Edge2 [] generateEdge2Array(int n) {
        Edge [] temp = generateEdgeArray(n);
        Edge2[] result = new Edge2[temp.length];

        for (int i = 0; i < temp.length; i++) {
            Edge2 item = new Edge2(temp[i].getA(), temp[i].getB(), false);
            result[i] = item;

        }
        return result;
    }

}
