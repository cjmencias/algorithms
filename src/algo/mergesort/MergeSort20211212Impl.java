package algo.mergesort;

import java.util.Arrays;

public class MergeSort20211212Impl {

    public static void main(String[] args) {
        MergeSort20211212Impl mergeSort = new MergeSort20211212Impl();
        System.out.println(Arrays.toString(mergeSort.sort(new int[]{2, 1})));
        System.out.println(Arrays.toString(mergeSort.sort(new int[]{20, 35, -15, 7, 55, 1, -22})));
    }

    /*
     * Algorithm: Merge Sort
     * Time Complexity: O(N^2) or Quadratic
     * */
    protected int[] sort(int[] array) {
        return sort(array, 0, array.length);
    }

    protected int[] sort(int[] array, int sIdx, int eIdx) {
        if (eIdx - sIdx < 2) {
            return new int[]{array[sIdx]};
        }
        int splitIdx = (sIdx + eIdx) / 2;
        int[] lArray = sort(array, sIdx, splitIdx);
        int[] rArray = sort(array, splitIdx, eIdx);
        int[] mArray = new int[eIdx - sIdx];
        for (int m = 0, l = 0, r = 0; m < mArray.length; m++) {
            if (l < lArray.length && r < rArray.length) {
                mArray[m] = (lArray[l] < rArray[r]) ? lArray[l++] : rArray[r++];
            } else {
                mArray[m] = (l < lArray.length) ? lArray[l++] : rArray[r++];
            }
        }
        return mArray;
    }

}
