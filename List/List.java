public class List {

    private ListElement first = null;
    private ListElement last = null;

    public void addToList(int value) {

        ListElement newItem = new ListElement(value);

        if (this.first == null) {
            this.first = newItem;
        }

        if (this.last != null) {
            this.last.setNext(newItem);
        }
        this.last = newItem;
    }

    public void removeFirst() {
        if (this.first != null) {
            this.first = this.first.getNext();
        }
    }

    public void removeList() {
        if (this.last != null) {
            this.last = this.last.getPrev();
        }
    }

    public int removeByValue(int value) {
        if (this.first != null) {
            do {
                if (first.getValue() == value) {
                    // remove item
                    first.getPrev().setNext(first.getNext());
                    first.getNext().setPrev(first.getPrev());
                }
                first = first.getNext();
            } while (first.getNext() != null);

        }
        return -1;
    }

}
