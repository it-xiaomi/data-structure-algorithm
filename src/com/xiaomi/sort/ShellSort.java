package com.xiaomi.sort;

import com.xiaomi.util.DataUtils;

import java.util.Arrays;
import java.util.Date;

/**
 * shell排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {8,9,1,7,2,3,5,4,6,0};
        // shellSort2(array);

        System.out.println("插入排序开始时间：" + DataUtils.getDate(new Date()));
        //测试100000个数据排序
         shellSort2(DataUtils.getArrayData());
        // shellSort(array);
        System.out.println("插入排序结束时间：" + DataUtils.getDate(new Date()));
    }

    /**
     * 移位法
     * @param array
     */
    public static void shellSort2(int[] array) {

        for(int gap = array.length/2; gap >= 1; gap /= 2) {

            for(int i=gap; i<array.length; i++) {
                int insertIndex = i;
                int insertValue = array[insertIndex];
                if(array[insertIndex] < array[insertIndex - gap]) {
                    while (insertIndex - gap >= 0 && insertValue < array[insertIndex - gap]) {
                        array[insertIndex] = array[insertIndex - gap];
                        insertIndex -= gap;
                    }

                    array[insertIndex] = insertValue;
                }
            }
        }
        // System.out.println(Arrays.toString(array));
    }

    /**
     * 交换法
     * @param array
     */
    public static void shellSort(int[] array) {

        int temp;
        int num = 0;
        int gap = array.length/2;
        while (true) {

            if(gap == 0) {
                break;
            }

            // 第一轮排序，将整个数组分成了5（10/2）组
            for(int i=gap; i<array.length; i++) {
                // 遍历各组中的所有元素（共5组，每组有2个数据），步长位5
                for(int j=i-gap; j>=0; j -= gap) {
                    if(array[j] > array[j+gap]) {
                        temp = array[j];
                        array[j] = array[j+gap];
                        array[j+gap] = temp;
                    }
                }
            }

            gap = gap/2;

            // System.out.println("shell排序第"+(++num)+"轮后结果：" + Arrays.toString(array));
        }

        /*for(int gap = array.length/2; gap >= 1; gap /= 2) {

            // 第一轮排序，将整个数组分成了5（10/2）组
            for(int i=gap; i<array.length; i++) {
                // 遍历各组中的所有元素（共5组，每组有2个数据），步长位5
                for(int j=i-gap; j>=0; j -= gap) {
                    if(array[j] > array[j+gap]) {
                        temp = array[j];
                        array[j] = array[j+gap];
                        array[j+gap] = temp;
                    }
                }
            }

            num++;
            System.out.println("shell排序第"+num+"轮后结果：" + Arrays.toString(array));
        }*/


        // =============================================================================================
        /*int temp;
        // 第一轮排序，将整个数组分成了5（10/2）组
        for(int i=5; i<array.length; i++) {
            // 遍历各组中的所有元素（共5组，每组有2个数据），步长位5
            for(int j=i-5; j>=0; j -= 5) {
                if(array[j] > array[j+5]) {
                    temp = array[j];
                    array[j] = array[j+5];
                    array[j+5] = temp;
                }
            }
        }

        System.out.println("shell排序第一轮后结果：" + Arrays.toString(array));

        // 第二轮排序，将整个数组分成了2（5/2）组
        for(int i=2; i<array.length; i++) {
            // 遍历各组中的所有元素（共2组，每组有5个数据），步长位2
            for(int j=i-2; j>=0; j -= 2) {
                if(array[j] > array[j+2]) {
                    temp = array[j];
                    array[j] = array[j+2];
                    array[j+2] = temp;
                }
            }
        }

        System.out.println("shell排序第二轮后结果：" + Arrays.toString(array));

        // 第三轮排序，将整个数组分成了1（2/2）组
        for(int i=1; i<array.length; i++) {
            // 遍历各组中的所有元素（共1组，每组有10个数据），步长位1
            for(int j=i-1; j>=0; j -= 1) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("shell排序第三轮后结果：" + Arrays.toString(array));*/
    }
}
