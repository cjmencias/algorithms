package algo.insertionsort;

import java.util.Arrays;

public class InsertionSort02Impl {

    public static void main(String[] args) {
        InsertionSort02Impl insertionSort = new InsertionSort02Impl();
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
        insertionSort.sort(array, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public void sort(int[] array, int unsortedIdx) {
        if (unsortedIdx < 1) {
            return;
        }

        sort(array, unsortedIdx - 1);
        System.out.println("unsortedIdx=" + unsortedIdx);

        int newElement = array[unsortedIdx];
        int i = unsortedIdx;
        for (; i > 0 && array[i - 1] > newElement; i--) {
            array[i] = array[i - 1];
        }
        array[i] = newElement;

    }

}
