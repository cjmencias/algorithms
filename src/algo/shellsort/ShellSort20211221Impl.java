package algo.shellsort;

import java.util.Arrays;

public class ShellSort20211221Impl {

    public static void main(String[] args) {
        ShellSort20211221Impl algo = new ShellSort20211221Impl();
        int[] array = new int[]{5, 3, -2, 0, 13, 5, 9, 7, 14};
        algo.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j = i;
                for (; j > (gap - 1) && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

}
