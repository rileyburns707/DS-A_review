import java.util.*;
public class hashTable {
    
    public static void main(String[] args) {
        
        /* <Integer, String> Hashtable 
        Hashtable<Integer, String> table = new Hashtable<>(10);   // initial capacity of 11 & load factor of 0.75

        table.put(100, "Descartes");
        table.put(123, "Epictetus");
        table.put(321, "Kierkegaard");
        table.put(555, "Kant");
        table.put(777, "Aristotle");

        // table.remove(100);

        for(Integer key : table.keySet()) {     // keySet() makes keys iterable
            System.out.println("Hash: " + key.hashCode() + "\t" + "Index: " + key.hashCode() % 10 + "\t" + "Key: " + key + "\t" + "Value: " + table.get(key));
        }
        */

        /* <String, String> Hashtable */
        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Descartes");
        table.put("123", "Epictetus");
        table.put("321", "Kierkegaard");
        table.put("555", "Kant");
        table.put("777", "Aristotle");


        for(String key : table.keySet()) { 
            // System.out.println("Hash: " + key.hashCode() + "\t" + "Index: " + key.hashCode() % 10 + "\t" + "Key: " + key + "\t" + "Value: " + table.get(key));
            System.out.println("Hash: " + key.hashCode() + "\t" + "Index: " + key.hashCode() % 21 + "\t" + "Key: " + key + "\t" + "Value: " + table.get(key));
        }
    }
}
