package main.linkedlist;

public class LinkedlistRunner {
    public static void main(String[] args) {
        LinkedList objLinkedList = new LinkedList(1);
        objLinkedList.append(2);
        objLinkedList.append(3);
        objLinkedList.append(4);

        System.out.println("LL before reverse();");
        objLinkedList.printList();

        objLinkedList.reverse();

        System.out.println("\nLL after reverse();");
        objLinkedList.printList();


    }
}
