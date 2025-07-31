public class bubbleSort {
    public static void main(String[] args) {
        
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
       
        bubbleSort(array);

        for(int i: array) {
            System.out.println(i);
        }

    }

     // bubble sort method
    private static void bubbleSort(int array[]) {

        for(int i =0; i < array.length -1; i++) {
            for(int j =0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {     // checks to see which number in the pair is greater. Swap the ">" with a "<" to make in descending order
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return ;
    }
}
