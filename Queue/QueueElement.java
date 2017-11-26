public class QueueElement {

    private QueueElement prev = null;
    private int value;

    public QueueElement(int value) {
        this.value = value;
    }

    public QueueElement getPrev() {
        return prev;
    }

    public void setPrev(QueueElement prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
