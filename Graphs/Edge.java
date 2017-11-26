package Graphs;

public class Edge {

    private int a;
    private int b;

    public Edge() {
        this.a = 0;
        this.b = 0; // inicjujemy pola zeby podczas tworzenia obiektu byly one juz zainicjowane
    }

    public Edge(int a, int b) { // drugi konstruktor ktory posluzy nam do wstawiania gotowych wartosci a i b
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
