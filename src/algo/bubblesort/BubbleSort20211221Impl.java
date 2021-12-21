package algo.bubblesort;

import java.util.Arrays;

public class BubbleSort20211221Impl {

    public static void main(String[] args) {
        BubbleSort20211221Impl algo = new BubbleSort20211221Impl();
        int[] array = new int[]{6, 0, -1, 4, 2, 0};
        algo.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(int[] array) {
        for (int u = array.length - 1; u > 0; u--) {
            for (int i = 0; i < u; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

}
