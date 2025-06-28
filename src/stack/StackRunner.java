package stack;

public class StackRunner {
    public static void main(String[] args) {
        Stack runnerStack = new Stack(2);
        runnerStack.printStack();
        runnerStack.getTop();
        runnerStack.getHeight();
        runnerStack.push(4);
        runnerStack.printStack();
        runnerStack.pop();
        runnerStack.printStack();

    }
}
