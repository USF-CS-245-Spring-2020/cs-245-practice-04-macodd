package Practice04;

public class InsertionSort implements SortingAlgorithm {

    /*
    Sort method (Insertion Sort):
    Rearranges passed array (a[]) by checking
    the current value against all the values
    before it in the array
     */
    public void sort(int[] arr){
        for (int i = 1; i < arr.length; ++i) {
            int current = arr[i];  // current value
            int prev = i - 1;  // value stored on the previous index

            /* Move elements of arr[0..i-1], that are
               greater than current, to one position ahead
               of their current position */
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev -= 1;
            }
            arr[prev + 1] = current;
        }
    }
}
