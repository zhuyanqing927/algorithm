package com.yankie.zhu.algorithm.search;

/**
 * 顺序查找
 */
public class SequenceSearch {

    public static int search(int[] args, int element) {

        for (int i = 0; i < args.length; i++) {
            if (args[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
