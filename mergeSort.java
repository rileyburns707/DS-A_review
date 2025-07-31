public class mergeSort {
    
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        // invoke merge sort methid
        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    private static void mergeSort(int[] array) {
        
        int length = array.length;
        // base case
        if (length <= 1) {
            return;
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        
        // copying elements of og array into new split arrays
        int i = 0; // left array
        int j = 0; // right array
        for(; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        // recursive case
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    // helper method - method that helps another method
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        // cache left and right array in local variables
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indicies
        
        // check the conditions for merging
        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r< rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
