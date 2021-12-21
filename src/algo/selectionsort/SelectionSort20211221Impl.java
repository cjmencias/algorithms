package algo.selectionsort;

import java.util.Arrays;

public class SelectionSort20211221Impl {

    public static void main(String[] args) {
        SelectionSort20211221Impl algo = new SelectionSort20211221Impl();
        int[] array = new int[]{6, 0, -1, 4, 2, 0};
        algo.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(int[] array) {
        for (int u = array.length - 1; u > 0; u--) {
            int idx = 0;
            for (int i = 0; i <= u; i++) {
                if (array[i] > array[idx]) {
                    idx = i;
                }
            }
            int temp = array[u];
            array[u] = array[idx];
            array[idx] = temp;
        }
    }

}
