package Graphs;


public class GraphMain {

    public static void main(String[] args) {

        transformEtoA(4,3);
        //generateGnk(4, 3);
        //generateGnp(4, 0.5);
    }

    public static void generateGnp (int n, double p) {
        boolean[][] results = GraphGnp.generateGnp(n,p);
        PrintStructures.printA(results);
    }

    public static void generateGnk (int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n,k);
        PrintStructures.printE(result);
    }

    public static void transformEtoA (int n, int k) {
        Edge [] graphGnk = GraphGnk.generateGnk(n,k);
        boolean [][] result = Transforms.transformEtoA(n,k,graphGnk);
        PrintStructures.printA(result);
    }
}
