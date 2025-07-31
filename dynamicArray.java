import java.util.ArrayList;

public class dynamicArray {
    public static void main(String[] args) {
        
        // Use in future use cases of dynamic array. For learning i'm going to make my own class though
        // ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArrayClass dynamicArray = new DynamicArrayClass(5);   // was empty but changed to 5 to test grow element

        // add to the array
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");  // testing grow element
    
        System.out.println("\n" + dynamicArray.toString());

        // testing shrink element. When the size is the third of the capacity it will shrink
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        System.out.println("\n" + dynamicArray.toString());

        /* 
        // insert element
        dynamicArray.insert(0, "X");
        System.out.println(dynamicArray.toString());

        // delete element
        dynamicArray.delete("A");
        System.out.println(dynamicArray.toString());

        // search element
        System.out.println("Search for A: " + dynamicArray.search("A"));
        System.out.println("Search for C: " + dynamicArray.search("C"));
        */
        
        // checking isEmpty method
        System.out.println("\nEmpty: " + dynamicArray.isEmpty());

        // checking size 
        System.out.println("Size: " + dynamicArray.size);

        // checking capacity 
        System.out.println("Capacity: " + dynamicArray.capacity + "\n");
        
    }
}
