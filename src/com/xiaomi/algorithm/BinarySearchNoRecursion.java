package com.xiaomi.algorithm;

/**
 * 二分查找-非递归方式
 */
public class BinarySearchNoRecursion {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int value = binarySearch(array, 5);
        System.out.println(value);
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length-1;

        while (left <= right) {
            int middle = (left + right)/2;
            if(array[middle] == value) {
                return middle;
            } else if(array[middle] > value) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
