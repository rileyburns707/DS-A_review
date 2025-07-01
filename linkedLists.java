import java.util.LinkedList;

public class linkedLists {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<String>();   // boom you have a linked list

        // linkedList as a stack
        /* 
        // .push() and .pop() methdod
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        */ 

        // linkedList as a queue
         
        // .offer() and .poll() methdod
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();
        
        // insertion & deletion of nodes
        linkedList.add(4, "E");
        linkedList.remove("E");
        linkedList.addFirst("0");
        linkedList.addLast("G");
        // store them in a variable as well
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        // searching for an element
        System.out.println(linkedList.indexOf("F"));

        // peek for an element
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());


        System.out.println(linkedList);
    }
}
