package algo.countingsort;

import java.util.Arrays;

public class CountingSort20211212Impl {

    public static void main(String[] args) {
        CountingSort20211212Impl countingSort = new CountingSort20211212Impl();
        //System.out.println(Arrays.toString(countingSort.sort(new int[]{ 6, 7, 5}, 5, 7)));
        System.out.println(Arrays.toString(countingSort.sort(new int[]{2, 5, 9, 8, 2, 8, 7, 10, 4, 3}, 0, 10)));
    }

    /*
     * Algorithm: Counting Sort
     * Time Complexity: O(N) Linear but requires assumptions
     * */
    protected int[] sort(int[] array, int min, int max) {
        System.out.println(Arrays.toString(array));
        int[] counts = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            counts[array[i] - min]++;
        }
        System.out.println(Arrays.toString(counts));
        for (int i = 0, k = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                array[k++] = min + i;
            }
        }
        return array;
    }


}
