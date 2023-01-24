public class MQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int nItems;

    public MQueue(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public void insert(int newElement) {

        if (rear == (queue.length) - 1) {
            rear = -1;
        }
        queue[++rear] = newElement;
        nItems++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == queue.length) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int peekFront() {
        return queue[front];
    }

    public int size() {
        return nItems;
    }

    public boolean isFull() {
        return (nItems == queue.length);
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

}
