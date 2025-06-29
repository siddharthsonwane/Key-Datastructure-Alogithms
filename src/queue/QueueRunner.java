package queue;

public class QueueRunner {
   public static void main(String[] args) {
        Queue  myQueue= new Queue(2);
        System.out.println("------>Before enqueue<----------------");
        System.out.println("---------------------------------------");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

       System.out.println("\nQueue:");
       myQueue.printQueue();

       myQueue.enQueue(1);

       System.out.println("\n\nAfter enqueue()");
       System.out.println("--------------------------------------------");
       myQueue.getFirst();
       myQueue.getLast();
       myQueue.getLength();

       System.out.println("\nQueue:");
       myQueue.printQueue();

   }

}
