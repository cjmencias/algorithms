package algo.bubblesort;

import java.util.Arrays;

public class BubbleSortImpl {

    /*
    * Algorithm: Bubble Sort
    * Time Complexity: O(N^2) or Quadratic
    * */
    protected int[] sort(int[] array) {
        for (int unsortedLastIdx = array.length - 1; unsortedLastIdx > 0; unsortedLastIdx--) {
            for (int i = 0; i < unsortedLastIdx; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSortImpl bubbleSort = new BubbleSortImpl();
        System.out.println(Arrays.toString(bubbleSort.sort(new int[]{ 5, 3, -2, 0, 5, 9, 14 })));
        System.out.println(Arrays.toString(bubbleSort.sort(new int[]{ 0 })));
        System.out.println(Arrays.toString(bubbleSort.sort(new int[]{ })));
    }

}
