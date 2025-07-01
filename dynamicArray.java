import java.util.ArrayList;

public class dynamicArray {
    public static void main(String[] args) {
        
        // Use in future use cases of dynamic array. For learning i'm going to make my own though
        // ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArrayClass dynamicArray = new DynamicArrayClass();

        // add to the array
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
    
        System.out.println(dynamicArray.toString());

        // insert element
        dynamicArray.insert(0, "X");
        System.out.println(dynamicArray.toString());
        
        // checking isEmpty method
        System.out.println("Empty: " + dynamicArray.isEmpty());

        // checking size 
        System.out.println("Size: " + dynamicArray.size);

        // checking capacity 
        System.out.println("Capacity: " + dynamicArray.capacity);
        
    }
}
