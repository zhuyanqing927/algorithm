package com.yankie.zhu.algorithm.sort;

public class QuickSort {

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }

        int low = left;
        int high = right;

        quickSort(array, low, right - 1);
        quickSort(array, low + 1, high);

    }
}
