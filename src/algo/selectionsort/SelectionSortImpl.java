package algo.selectionsort;

import java.util.Arrays;

public class SelectionSortImpl {

    public static void main(String[] args) {
        SelectionSortImpl selectionSort = new SelectionSortImpl();
        System.out.println(Arrays.toString(selectionSort.sort(new int[]{ 5, 3, -2, 0, 5, 9, 14 })));
        System.out.println(Arrays.toString(selectionSort.sort(new int[]{ 0 })));
        System.out.println(Arrays.toString(selectionSort.sort(new int[]{  })));
    }

    /*
     * Algorithm: Selection Sort
     * Time Complexity: O(N^2) or Quadratic
     * */
    protected int[] sort(int[] array) {
        for (int lastUnsortedIdx = array.length - 1; lastUnsortedIdx > 0; lastUnsortedIdx--) {
            int idxHighest = 0;
            for (int i = 0; i <= lastUnsortedIdx; i++) {
                if (array[i] > array[idxHighest]) {
                    idxHighest = i;
                }
            }
            // swap
            int temp = array[lastUnsortedIdx];
            array[lastUnsortedIdx] = array[idxHighest];
            array[idxHighest] = temp;
        }
        return array;
    }

}
