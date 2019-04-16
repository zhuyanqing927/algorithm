package com.yankie.zhu.algorithm.sort;

import com.yankie.zhu.algorithm.utils.AlgorithmUtils;

/**
 * 选择排序
 */
public class SelectionSort {

    private SelectionSort() {
    }

    public static void main(String[] args) {
        int[] array = AlgorithmUtils.generateIntArray(20);

        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    private static void selectionSort(int[] array) {

        int len = array.length;
        if (len == 0) {
            return;
        }

        for (int i = 0; i < len - 1; i++) {
            //array数组中最小元素的索引
            int minElementIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            AlgorithmUtils.swap(array, i, minElementIndex);
        }
    }


}
