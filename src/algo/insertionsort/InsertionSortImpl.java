package algo.insertionsort;

import java.util.Arrays;

public class InsertionSortImpl {

    /*
     * Algorithm: Insertion Sort
     * Time Complexity: O(N^2) or Quadratic
     * */
    protected int[] sort(int[] array) {
        for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            int newElement = array[unsortedIndex];

            // First Implementation
            /*for (int i = unsortedIndex - 1; i >= 0; i--) {
                if (newElement > array[i]) {
                    // position is found
                    array[i + 1] = newElement;
                    break;
                } else {
                    // move to the right
                    array[i + 1] = array[i];

                    // final position is used
                    if (i == 0) {
                        array[i] = newElement;
                    }
                }
            }*/

            // Better Implementation
            int i = 0;
            for (i = unsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        return array;
    }

    public static void main(String[] args) {
        InsertionSortImpl insertionSort = new InsertionSortImpl();
        System.out.println(Arrays.toString(insertionSort.sort(new int[]{20, 35, -15, 7, 55, 1, -22})));
        System.out.println(Arrays.toString(insertionSort.sort(new int[]{0})));
        System.out.println(Arrays.toString(insertionSort.sort(new int[]{})));
    }

}
