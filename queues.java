import java.util.LinkedList;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        // going over .offer()
        queue.offer("Lebron");
        queue.offer("Luka");
        queue.offer("Kyrie");
        queue.offer("Curry");

        // System.out.println(queue);

        // going over .peek()
        // System.out.println(queue.peek());

        // going over .poll()
        //System.out.println(queue.poll());

        // going over .isEmpty()
        // System.out.println(queue.isEmpty());

        // going over .size()
        // System.out.println(queue.size());

        // going over .contains()
        System.out.println(queue.contains("Jordan"));

        System.out.println(queue);

    }
}
