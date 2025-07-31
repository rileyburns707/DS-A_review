import java.util.Arrays;
public class binarySearch {

    public static void main(String[] args) {
        
        /* Using "Arrays" method
        int array[] = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = Arrays.binarySearch(array, target);
        if(index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Target was found at index " + index);
        }
        */

        // Creating my own binary search function
        int array[] = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);
        if(index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Target was found at index " + index);
        }

    }

    // my binary search function
    private static int binarySearch(int[] array, int target) {
        
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + middle);    // not needed, but lets me see how many steps are taken

            if(value < target) {
                low = middle + 1;
            }
            else if(value > target) {
                high = middle -1;
            }
            else {
                return middle; // target is found
            }

        }
        return -1;  // target not found
    }
    
}
