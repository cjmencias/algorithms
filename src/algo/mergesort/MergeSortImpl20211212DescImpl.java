package algo.mergesort;

import java.util.Arrays;

public class MergeSortImpl20211212DescImpl {

    public static void main(String[] args) {
        MergeSortImpl20211212DescImpl sorting = new MergeSortImpl20211212DescImpl();
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(sorting.sort(array, 0, array.length)));
    }

    public int[] sort(int[] array, int start, int end) {
        if (end - start < 2) {
            //return Arrays.copyOfRange(array, start, end);
            return new int[]{array[start]};
        }
        int split = (start + end) / 2;
        int[] lArray = sort(array, start, split);
        int[] rArray = sort(array, split, end);
        int[] mArray = new int[end - start];
        for (int m = 0, l = 0, r = 0; m < mArray.length; m++) {
            if (l < lArray.length && r < rArray.length) {
                mArray[m] = (lArray[l] > rArray[r]) ? lArray[l++] : rArray[r++];
            } else {
                mArray[m] = (l < lArray.length) ? lArray[l++] : rArray[r++];
            }
        }
        return mArray;
    }

}
