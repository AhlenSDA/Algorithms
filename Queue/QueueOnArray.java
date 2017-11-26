public class QueueOnArray {

    // FIFO

    private int[] queue;
    private int currentIndex = 0;

    public QueueOnArray(int size) {
        this.queue = new int[size];
    }

    public boolean isEmpty() {
        if (this.currentIndex == 0) {
            return true;
        }
        return false;
    }

    public int removeFromQueue() {

        if (currentIndex > 0) {
            int temp = this.queue[0];
            for (int i = 1; i < this.queue.length; i++) {
                this.queue[i - 1] = this.queue[i];
            }
            currentIndex--;
            return temp;
        }
    return -1;
    }

    public void printQueue() {
        for (int i = 0; i < currentIndex; i++) {
            Helper.printInt(this.queue[i]);
        }
    }

    public int getPickOfQueue() {

        if (currentIndex > 0) {
            return this.queue[0];
        }
        return -1;
    }

    public void addToQueue(int item) {
        if (currentIndex < this.queue.length - 1) {
            this.queue[currentIndex] = item;
            currentIndex++;
        }
    }

}
