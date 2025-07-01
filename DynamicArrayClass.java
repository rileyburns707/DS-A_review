// I decided to make my own dynamic arrary for learning
    // Normally just use predefined ArrayList

public class DynamicArrayClass {
    int size;
    int capacity = 10;
    Object[] array;

    // over loading constructors
    public DynamicArrayClass() {
        this.array = new Object[capacity];
    }
    public DynamicArrayClass(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // declaring all the methods that we will need
    public void add(Object data) {
        
        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if(size >= capacity) {
            grow();
        }
        for(int i = size; i > index; i--) {  
            array[i] = array[i-1];  // shift all the elements to the right to make room for new insertion
        }
        array[index] = data;
        size ++;
    }

    public void delete(Object data) {
        
    }

    public int search(Object data) {
        return -1;
    }

    private void grow() {   // expand the size of the array
        
    }

    private void shrink() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        
        String string = "";

        for(int i = 0; i < capacity; i++) {
            string += array[i] + ", ";

        }
        if(string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }
}
