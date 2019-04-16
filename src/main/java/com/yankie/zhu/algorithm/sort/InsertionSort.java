package com.yankie.zhu.algorithm.sort;

import com.yankie.zhu.algorithm.utils.AlgorithmUtils;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = AlgorithmUtils.generateIntArray(20000);

        long startTime = System.nanoTime();
        System.out.println("-------insertionSort1-------");
        insertionSort1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("insertionSort1耗时：" + (System.nanoTime() - startTime));

        System.out.println("-------insertionSort2-------");
        insertionSort2(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("insertionSort2耗时：" + (System.nanoTime() - startTime));
    }

    private static void insertionSort1(int[] array) {
        int len = array.length;
        if (len == 0) {
            return;
        }

        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    AlgorithmUtils.swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void insertionSort2(int[] array) {
        int len = array.length;
        if (len == 0) {
            return;
        }

        for (int i = 1; i < len; i++) {
            int e = array[i];
            int j;
            for (j = i; j > 0; j--) {
                if (array[j - 1] > e) {
                    array[j] = array[j - 1];
                } else {
                    break;
                }
            }
            array[j] = e;
        }
    }

}
