package stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        top = new Node(value);
        height = 1;
    }

    public void printStack() {
        System.out.println("-----------------> printStack Method <------------------");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("-----------------> getTop Method <------------------");
        if (top == null) {
            System.out.println("Top : null");
        } else {
            System.out.println("Top:" + top.value);
        }
    }

    public void getHeight() {
        System.out.println("-----------------> getHeight Method <------------------");
        System.out.println("Height : " + height);
    }

    public void push(int value){
        System.out.println("-----------------> push Method <------------------");
        Node newNode = new Node(value);
        if (height != 0) {
            newNode.next = top;
        }
        top  = newNode;
        height ++;

    }

    public Node pop(){
        System.out.println("-----------------> pop Method <------------------");
        if (height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height --;
        return temp;

    }
    

}


