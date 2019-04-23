package com.yankie.zhu.algorithm.search;

import com.yankie.zhu.algorithm.utils.AlgorithmUtils;

/**
 * 顺序查找
 */
public class SequenceSearch {

    public static void main(String[] args) {
        int[] array = AlgorithmUtils.generateIntArray(20);

        int searchResultIndex = sequenceSearch(array, 10086);
        System.out.println(searchResultIndex);
    }

    public static int sequenceSearch(int[] args, int element) {

        for (int i = 0; i < args.length; i++) {
            if (args[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
