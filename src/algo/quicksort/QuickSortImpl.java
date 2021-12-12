package algo.quicksort;

import java.util.Arrays;

public class QuickSortImpl {

    /*
     * Algorithm: Quick Sort
     * Time Complexity: O(N^2) Quadratic or LogN (Logarithmic) at best
     * */
    protected void sort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIdx = partition(array, start, end);
        sort(array, start, pivotIdx);
        sort(array, pivotIdx + 1, end);
    }

    protected int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && array[--j] >= pivot) ;
            if (i < j) {
                array[i] = array[j];
            }
            while (i < j && array[++i] <= pivot) ;
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
        QuickSortImpl quickSort = new QuickSortImpl();
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
        quickSort.sort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

}
