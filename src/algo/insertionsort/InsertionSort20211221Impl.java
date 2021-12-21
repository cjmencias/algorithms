package algo.insertionsort;

import java.util.Arrays;

public class InsertionSort20211221Impl {

    public static void main(String[] args) {
        InsertionSort20211221Impl algo = new InsertionSort20211221Impl();
        int[] array = new int[]{5, 3, -2, 0, 13, 5, 9, 7, 14};
        algo.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int j = i;
            for (; j > 0 && array[j - 1] > num; j--) {
                array[j] = array[j - 1];
            }
            array[j] = num;
        }
    }

}
