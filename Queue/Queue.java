public class Queue {

    private QueueElement first = null;
    private QueueElement last = null;

    public void addToQueue(int value) {

        QueueElement item = new QueueElement(value);
        item.setPrev(this.last);
        this.last = item;

        if (this.first == null) {
            this.first = item;
        }
    }

    public void removeFromQueue() {
        if (this.last != null) {
            while (last.getPrev() != this.first) {

            }
        }
    }

    public boolean isEmpty() {
        if (this.first != null) {
            return true;
        }

            return false;
    }

    public int getLastAdded() {
        if (this.last != null) {
            return this.last.getValue();
        }
        return -1;
    }

    public void printQueue() {
        if (this.last != null) {
            QueueElement temp = this.last;
            while (temp.getPrev() != null) {
                Helper.printInt(temp.getValue());
                temp = temp.getPrev();
            }
            Helper.printInt(temp.getValue());
        }
    }

}