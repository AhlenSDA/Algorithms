public class InvokeHeap {

    public static void main(String[] args) {

        HeapOnArray heap = new HeapOnArray(5);
        heap.addToHeap(3);
        heap.addToHeap(10);
        heap.addToHeap(-10);
        heap.printHeap();
        Helper.printString(String.valueOf(heap.isEmpty()));
        Helper.printString(String.valueOf(heap.getPickOfHeap()));
        Helper.printString(String.valueOf(heap.removeFromHeap()));
        Helper.printString(String.valueOf(heap.removeFromHeap()));
        Helper.printString(String.valueOf(heap.removeFromHeap()));
        Helper.printString(String.valueOf(heap.isEmpty()));
    }
}
