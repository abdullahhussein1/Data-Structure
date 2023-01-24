class StackX {
    private int maxSize;                   //size of stack myArray
    private double[] stackArray;
    private int top;                           // top of stack

    //-----------------------------------------------------------
    public StackX(int s) {                                      // constructor
        maxSize = s;                                         // set myArray size
        stackArray = new double[maxSize];
        top = -1;                                         // no items yet
    }

    //-------------------------------------------------------------
    public void push(double j) {           // put item on top of stack
        stackArray[++top] = j;           // increment top, insert item
    }

    //----------------------------------------------------------
    public double pop() {                           // take item from top of stack
        return stackArray[top--];                 // access item, decrement top
    }

    //----------------------------------------------------------
    public double peek() {                          // peek at top of stack
        return stackArray[top];
    }

    //-------------------------------------------------------------
    public boolean isEmpty() {                            // true if stack is empty
        return (top == -1);
    }

    //---------------------------------------------------------
    public boolean isFull() {                        // true if stack is full
        return (top == maxSize - 1);
    }

}

class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);     // make new stack
        theStack.push(20);                 // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()) {     // until it's empty,
            double value = theStack.pop();
            System.out.print(value);          // display it
            System.out.print(" ");
        }
        System.out.println(" ");
    }                                                       // end main()
}
