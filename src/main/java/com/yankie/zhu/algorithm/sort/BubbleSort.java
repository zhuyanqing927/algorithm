package com.yankie.zhu.algorithm.sort;

import com.yankie.zhu.algorithm.utils.AlgorithmUtils;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = AlgorithmUtils.generateIntArray(4000);

        long startTime = System.nanoTime();

        System.out.println("-----bubbleSort1-------");
        bubbleSort1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("bubbleSort1耗时：" + (System.nanoTime() - startTime));

        System.out.println("-----bubbleSort2-------");
        startTime = System.nanoTime();
        bubbleSort2(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("bubbleSort2耗时：" + (System.nanoTime() - startTime));

        System.out.println("-----bubbleSort3-------");
        startTime = System.nanoTime();
        bubbleSort3(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("bubbleSort3耗时：" + (System.nanoTime() - startTime));

    }

    private static void bubbleSort1(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    AlgorithmUtils.swap(arr, i, j);
                }
            }
        }
    }

    public static void bubbleSort2(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    AlgorithmUtils.swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSort3(int[] array) {
        int len = array.length;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (array[j] > array[j + 1]) {
                    AlgorithmUtils.swap(array, j, j + 1);
                }
            }
        }
    }


}
