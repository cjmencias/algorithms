package algo.shellsort;

import java.util.Arrays;

public class ShellSortImpl {

    /*
     * Algorithm: Shell Sort with simplified gap formula
     * Time Complexity: O(N^2) or Quadratic
     * */
    protected int[] sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int unsortedIndex = gap; unsortedIndex < array.length; unsortedIndex++) {
                int newElement = array[unsortedIndex];
                int i = unsortedIndex;
                for (; i > 0 && array[i - gap] > newElement; i -= gap) {
                    array[i] = array[i - gap];
                }
                array[i] = newElement;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        ShellSortImpl shellSort = new ShellSortImpl();
        System.out.println(Arrays.toString(shellSort.sort(new int[]{20, 35, -15, 7, 55, 1, -22})));
        System.out.println(Arrays.toString(shellSort.sort(new int[]{0})));
        System.out.println(Arrays.toString(shellSort.sort(new int[]{})));
    }

}
