package com.xiaomi.sort;

import com.xiaomi.util.DataUtils;

import java.util.Arrays;
import java.util.Date;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {8,5,7,0};

        System.out.println("插入排序开始时间：" + DataUtils.getDate(new Date()));
        //测试100000个数据排序
//        insertSort(DataUtils.getArrayData());
        insertSort(array);
        System.out.println("插入排序结束时间：" + DataUtils.getDate(new Date()));
    }

    private static void insertSort(int[] array) {

        for(int i=1; i<array.length; i++) {
            // 定义好待插入的值和位置
            int insertValue = array[i];
            int insertIndex = i-1; // array[1] 下标的前一个位置

            // 防止在找位置时角标月结
            // insertValue < array[insertIndex] 说明还没找到待插入的位置下标
            while (insertIndex >= 0 && insertValue < array[insertIndex]) {
                array[insertIndex + 1] = array[insertIndex];
                insertIndex--;
            }

            //当退出while循环时，说明已经找到待插入的角标
            array[insertIndex + 1] = insertValue;

//            System.out.println("第"+i+"轮排序结果：" + Arrays.toString(array));
        }


        /*// 定义好待插入的值和位置
        int insertValue = array[1];
        int insertIndex = 1-1; // array[1] 下标的前一个位置

        // insertIndex >= 0 防止在找位置时角标越界
        // insertValue < array[insertIndex] 说明还没找到待插入的位置下标
        while (insertIndex >= 0 && insertValue < array[insertIndex]) {
            array[insertIndex + 1] = array[insertIndex];
            insertIndex--;
        }

        //当退出while循环时，说明已经找到待插入的角标
        array[insertIndex + 1] = insertValue;

        System.out.println("第一轮排序结果：" + Arrays.toString(array));

        // 定义好待插入的值和位置
        insertValue = array[2];
        insertIndex = 2-1; // array[1] 下标的前一个位置

        // 防止在找位置时角标月结
        // insertValue < array[insertIndex] 说明还没找到待插入的位置下标
        while (insertIndex >= 0 && insertValue < array[insertIndex]) {
            array[insertIndex + 1] = array[insertIndex];
            insertIndex--;
        }

        //当退出while循环时，说明已经找到待插入的角标
        array[insertIndex + 1] = insertValue;

        System.out.println("第二轮排序结果：" + Arrays.toString(array));*/
    }
}
