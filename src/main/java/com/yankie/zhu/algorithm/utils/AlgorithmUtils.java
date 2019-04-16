package com.yankie.zhu.algorithm.utils;


public class AlgorithmUtils {
    /**
     * 数组元素交换
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 生成指定大小的数组
     */
    public static int[] generateIntArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100 * size);
        }

        return array;
    }
}
