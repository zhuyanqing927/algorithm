package com.yankie.zhu.algorithm.sort;

public class MergeSort {

    public static void mergeSort(int[] array) {
        int len = array.length;
        if (len == 0) {
            return;
        }
        mergeSort(array, 0, len - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        if (array[mid] > array[mid + 1]) {
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        //辅助空间
        int[] auxArray = new int[right - left + 1];

        for (int i = left; i <= right; i++) {
            auxArray[i - left] = array[i];
        }

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {

            if (i > mid) {
                array[k] = auxArray[j - left];
                j++;
            } else if (j > right) {
                array[k] = auxArray[i - left];
            } else if (auxArray[i - left] < auxArray[j - left]) {
                array[k] = auxArray[i - left];
                i++;
            } else {
                array[k] = auxArray[j - left];
            }
        }
    }
}
