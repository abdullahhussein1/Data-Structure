public class qw {

    int[] queue;
    int front;
    int rear;
    int nItems;
    int maxSize;

    public qw(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    void insert (int j) {
        if (rear==maxSize-1)
            rear=-1;
        queue[++rear]=j;
        nItems++;
    }
    int remove() {
        int temp = queue[front++];
        if (front==maxSize)
            front=0;
        nItems--;
        return temp;
    }

}
