public class linearSearch {
    public static void main(String args[]) {

        int[] array = {9, 1, 8, 4, 2, 7, 5};    // do NOT need to be sorted
        // the fact that they don't need to be sorted is a HUGE advantage

        int index = linearSearch(array, 5);

        if(index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {   // declares function
        // need to loop through our array, 1 element at a time

        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        
        return -1;
    }
}
