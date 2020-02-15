package Practice04;

public class MergeSort implements SortingAlgorithm {

    /*
    Sort method (Merge Sort):
    Rearranges passed array (arr[]) by splitting
    the array into 2 until it reaches a size of 1.
    Once it is done program checks the value for each
    element of the array and rearranges them based on value
     */
    public void sort(int[] arr){

        // base case
        if(arr.length < 2)
            return;

        // find size of mid
        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // copy data to temp arrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        sort(left);  // recursive call for left side array
        sort(right);  // recursive call for right side array

        merge(arr, left, right);  // merges the arrays based on their value
    }

    private void merge(int[] target, int[] left, int[] right){
        int indexL, indexR, indexTarget;

        indexL = indexR = indexTarget = 0;

        while(indexL < left.length && indexR < right.length)
            if(left[indexL] <= right[indexR])
                target[indexTarget++] = left[indexL++];
            else
                target[indexTarget++] = right[indexR++];

        while(indexL < left.length)
            target[indexTarget++] = left[indexL++];

        while (indexR < right.length)
            target[indexTarget++] = right[indexR++];

    }
}
