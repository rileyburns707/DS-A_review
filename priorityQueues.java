import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueues {
    public static void main(String[] args) {
        /* 
        // standard queue
        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(3.5);
        queue.offer(4.5);
        queue.offer(1.2);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        */

        // priority queue

        // GPA example
        /* 
        // Queue<Double> queue = new PriorityQueue<>(); // ascending order. Standard order
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());  // descending order
        
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(3.5);
        queue.offer(4.5);
        queue.offer(1.2);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        */

        // Letter grade example
        Queue<String> queue = new PriorityQueue<>();    // alphabtical order
        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); // reverse alphabtical order

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("A");
        queue.offer("F");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
