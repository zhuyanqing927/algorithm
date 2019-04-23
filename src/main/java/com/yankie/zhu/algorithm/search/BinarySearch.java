package com.yankie.zhu.algorithm.search;

import com.yankie.zhu.algorithm.utils.AlgorithmUtils;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = AlgorithmUtils.generateIntArray(20);

        int searchResultIndex = binarySearch(array, 10086);
        System.out.println(searchResultIndex);
    }

    public static int binarySearch(int[] array, int element) {
        return binarySearch(array, element, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int element, int low, int high) {

        if (low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;
        if (array[middle] == element) {
            return middle;
        } else if (array[middle] > element) {    //array[middle] > element
            return binarySearch(array, element, low, middle - 1);
        } else {                                 //array[middle] < element
            return binarySearch(array, element, middle + 1, high);
        }
    }
}
