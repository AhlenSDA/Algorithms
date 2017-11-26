public class Heap {

    private HeapElement top = null;

    public void addToHeap(int value) {
        this.top = new HeapElement(value, this.top);
    }

    public int removeFromHeap() {

        if (this.top != null) {

            int temp = top.getValue();
            this.top = top.getPrev();
            return temp;
        }
        return -1;
    }

    public int getPickOfHeap () {
        if (this.top != null) {
            return this.top.getValue();
        }
        return -1;
    }

    public void printHeap() {
        while (this.top != null) {
            Helper.printInt(this.top.getValue());
            this.top = this.top.getPrev();
        }
    }


    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }

        return false;
    }
}
