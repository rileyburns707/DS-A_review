import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList_vs_arrayList {
    
    public static void main(String[] args) {
       
        LinkedList<Integer> linkedList = new LinkedList<Integer>();  // doubly linked list
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;  // a long is just a really long integer
        long endTime;
        long elapsedTime;

        // populate linkedList and arrayList
        for(int i =0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
       
        // ******************LinkedList******************
        startTime = System.nanoTime();

        // testing .get()
        // linkedList.get(0);
        // linkedList.get(500000);
        // linkedList.get(999999);

        // testing .remove()
        // linkedList.remove(0);
        // linkedList.remove(500000);  // still had to navigate to the middle element so it took longer
        linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("\nLinkedList:\t" + elapsedTime + " ns\n");

        // ******************ArrayList******************
        startTime = System.nanoTime();

        // testing .get()
        // arrayList.get(0);
        // arrayList.get(500000);
        // arrayList.get(999999);

        // testing .remove()
        // arrayList.remove(0);
        // arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("\nArrayList:\t" + elapsedTime + " ns\n");

    }
}
