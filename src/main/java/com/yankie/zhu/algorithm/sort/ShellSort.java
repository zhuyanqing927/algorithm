package com.yankie.zhu.algorithm.sort;

import com.yankie.zhu.algorithm.utils.AlgorithmUtils;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = AlgorithmUtils.generateIntArray(8);

        shellSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    private static void shellSort(int[] array) {
        int len = array.length;

        for (int h = len / 2; h > 0; h = h / 2) {
            for (int i = h; i < len; i++) {
                for (int j = i - h; j >= 0; j = j - h) {
                    if (array[j] > array[j + h]) {
                        AlgorithmUtils.swap(array, j, j + h);
                    }
                }
            }
        }
    }
}
