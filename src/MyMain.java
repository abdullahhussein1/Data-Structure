class MyStack {

    private int[] Stackk;
    private int top;

    public MyStack(int size) {
        Stackk = new int[size];
        top = -1;
    }

    public void push(int newElement) {
        if (!isFull()) {
            Stackk[++top] = newElement;
        }
    }

    public int pop() {
        return Stackk[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == Stackk.length - 1);
    }

    public int search(int element) {
        for (int i : Stackk) {
            if (element == i) {
                return i;
            }
        }
        return 0;
    }

    public int peek() {
        return Stackk[top];
    }


}

public class MyMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);

        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(3);
        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
