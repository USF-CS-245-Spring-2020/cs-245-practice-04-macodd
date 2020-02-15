package Practice04;

public class QuickSort implements SortingAlgorithm {

    public void sort(int[] arr){
        qs(arr, 0, arr.length - 1);
    }

    private void qs(int[] arr, int start, int end){
        if(start < end) {
            int pivot = partition(arr, start, end);
            qs(arr, start, pivot - 1);
            qs(arr, pivot + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;
        for(int j = start; j < end; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    private void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
