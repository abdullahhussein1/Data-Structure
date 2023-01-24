class Queueprob {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queueprob(int s) // constructor
    {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int j) // put item at rear of queue
    {
        if (rear == maxSize - 1) // deal with wraparound
            rear = -1;
        queArray[++rear] = j; // increment rear and insert
        nItems++; // one more item
    }

    public int remove() // take item from front of queue
    {
        int temp = queArray[front++]; // get value and incr front
        if (front == maxSize)
            front = 0;
        nItems--; // one less item
        return temp;
    }

    public int peekFront() // peek at front of queue
    {
        return queArray[front];
    }

    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }

    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }

    public int size() // number of items in queue
    {
        return nItems;
    }
} // end class Queue

public class MyQueue {
    public static void main(String[] args) {
        Queueprob theQueue = new Queueprob(5); // queue holds 5
        theQueue.insert(10); // insert 4 items
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.remove(); // remove 3 items
        theQueue.remove(); // (10, 20, 30)
        theQueue.remove();
        theQueue.insert(50); // insert 4 more items
        theQueue.insert(60); // (wraps around)
        theQueue.insert(70);
        theQueue.insert(80);
        while (!theQueue.isEmpty()) // remove and display
        {
            System.out.println(theQueue.remove()); // (40, 50, 60, 70, 80)
        }
    } // end main()
} //
