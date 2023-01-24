public class Stack {

    int[] stack;
    int top;
    int maxSize;

    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    void push(int j) {
        stack[++top] = j;
    }

    int pop() {
        return stack[top--];
    }

    boolean isEmpty() {
        return (top == -1);
    }

    boolean isFull() {
        return (top == maxSize - 1);
    }

    int search(int j) {
        for (int i : stack) {
            if (i == j)
                return i;
        }
        return 0;
    }

}










