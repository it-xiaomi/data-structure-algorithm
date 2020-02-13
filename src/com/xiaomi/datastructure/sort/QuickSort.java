package com.xiaomi.datastructure.sort;

import com.xiaomi.datastructure.util.DataUtils;

import java.util.Date;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

//        qucikSort(array, 0, array.length-1);

        System.out.println("快速排序开始时间：" + DataUtils.getDate(new Date()));
        //测试100000个数据排序
        qucikSort(DataUtils.getArrayData(), 0, array.length-1);
        System.out.println("快速排序结束时间：" + DataUtils.getDate(new Date()));
    }

    public static void qucikSort(int[] array, int left, int right) {
        int i, j;
        // 基准值
        int middleValue;
        int temp;

        if(left > right) {
            return;
        }

        i=left;
        j=right;
        middleValue = array[left];

        while (i < j) {
            //先从右侧开始找一个比基准值小的数据
            while (middleValue <= array[j] && i<j) {
                j -= 1;
            }
            //再从左侧开始找一个比基准值大的数据
            while (middleValue >= array[i] && i<j) {
                i += 1;
            }

            //如果满足条件，交换
            if(i<j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //最后将基准值与i和j相同的位置数据交换
        array[left] = array[i];
        array[i] = middleValue;

        //递归调用左边
        qucikSort(array, left, i-1);

        //递归调用右边
        qucikSort(array, j+1, right);

//        System.out.println(Arrays.toString(array));

    }
}
