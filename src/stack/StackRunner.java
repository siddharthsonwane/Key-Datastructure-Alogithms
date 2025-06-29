package stack;

public class StackRunner {
    public static void main(String[] args) {
        Stack myStack = new Stack(2);   // Creates a stack with initial value 2

        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();

        myStack.push(4);
        myStack.push(6);

        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();

        myStack.pop();
        myStack.printStack();
    }
}
