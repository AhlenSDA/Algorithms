public class InvokeQueue {

    public static void main(String[] args) {

       // invokeQueueOnArray();
        invokeQueue();
    }

    public static void invokeQueue() {
        Queue queue = new Queue();
        queue.addToQueue(10);
        queue.addToQueue(5);
        queue.addToQueue(1);
        queue.printQueue();

    }

    public static void invokeQueueOnArray() {

        QueueOnArray queue = new QueueOnArray(5);
        queue.addToQueue(3);
        queue.addToQueue(10);
        queue.addToQueue(-10);
        queue.printQueue();
        Helper.printString(String.valueOf(queue.isEmpty()));
        Helper.printString(String.valueOf(queue.getPickOfQueue()));
        Helper.printString(String.valueOf(queue.removeFromQueue()));
        Helper.printString(String.valueOf(queue.removeFromQueue()));
        Helper.printString(String.valueOf(queue.removeFromQueue()));
        Helper.printString(String.valueOf(queue.isEmpty()));
    }
}