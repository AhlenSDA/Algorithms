package Graphs;

public class GraphGnf {

    public static Edge2[] generateGraphGnf (int vertexNumber, int maxVertexDegree) {

        Edge2 [] edge2Array = Structures.generateEdge2Array(vertexNumber);
        int[] neighbourCounterArray = new int [vertexNumber];

        int maxIndex = edge2Array.length - 1;
        for (int i = 0; i < edge2Array.length; i++) {

            int randomIndex = (int)(Math.random() * maxIndex);

            if (neighbourCounterArray[edge2Array[randomIndex].getA()] < maxIndex
                    && neighbourCounterArray[edge2Array[randomIndex].getB()] < maxIndex) {

                Edge2 tempEdge2 = edge2Array[randomIndex];
                edge2Array[randomIndex] = edge2Array[maxIndex];
                edge2Array[maxIndex] = tempEdge2;

            }

            maxIndex--;




        }
        return edge2Array;
    }

}
