package com.xiaomi.sort;

import com.xiaomi.util.DataUtils;

import java.util.Arrays;
import java.util.Date;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {8,7,0,5,10,9,3,1};
        System.out.println("选择排序开始时间：" + DataUtils.getDate(new Date()));
        //测试100000个数据排序
        selectSort(DataUtils.getArrayData());
//        selectSort(array);
        System.out.println("选择排序结束时间：" + DataUtils.getDate(new Date()));
    }

    private static void selectSort(int[] array) {

        /*for (int i = 0; i < array.length - 1; i++) {
            //假设第一个就是最小值
            int minIndex = i;
            int minValue = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (minValue > array[j]) { //说明假设的不是最小值
                    minIndex = j;
                    //再将最小值重置
                    minValue = array[j];
                }
            }

            //当minIndex = i时，说明此次值就是最小的不需要执行交换
            if (minIndex !=  i) {
                //交换位置，先将查找到最小位置替换成第一个，再将第一个替换成记录下的最下值
                array[minIndex] = array[i];
                array[i] = minValue;
//                System.out.println("第" + (i + 1) + "轮排序后结果：" + Arrays.toString(array));
            }
        }*/

        // 假设第一个就是最小值
        int minIndex = 0;
        int minValue = array[0];

        for(int j=1; j<array.length; j++) {
            if(minValue > array[j]) { //说明假设的不是最小值
                minIndex = j;
                // 再将最小值重置
                minValue = array[j];
            }
        }

        if(minIndex != 0) {
            // 交换位置，先将查找到最小位置替换成第一个，再将第一个替换成记录下的最下值
            array[minIndex] = array[0];
            array[0] = minValue;
            System.out.println("第一轮排序后结果：" + Arrays.toString(array));
        }

        // 假设第一个就是最小值
        minIndex = 1;
        minValue = array[1];

        for(int j=2; j<array.length; j++) {
            if(minValue > array[j]) { //说明假设的不是最小值
                minIndex = j;
                // 再将最小值重置
                minValue = array[j];
            }
        }

        if(minIndex != 1) {
            // 交换位置，先将查找到最小位置替换成第一个，再将第一个替换成记录下的最下值
            array[minIndex] = array[1];
            array[1] = minValue;
            System.out.println("第一轮排序后结果：" + Arrays.toString(array));
         }
    }

    private static void selectSort1(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            //假设第一个就是最下的值
            int minIndex = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[minIndex] > array[j]) { //假设的最小值不成立
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

            System.out.println("第"+(i+1)+"轮排序结果：" + Arrays.toString(array));
        }

        /*//假设第一个就是最下的值
        int minIndex = 0;
        for(int j=1; j<array.length; j++) {
            if(array[minIndex] > array[j]) { //假设的最小值不成立
                minIndex = j;
            }
        }

        int temp = array[0];
        array[0] = array[minIndex];
        array[minIndex] = temp;

        System.out.println("第一轮排序结果：" + Arrays.toString(array));

        //假设第一个就是最下的值
        minIndex = 1;
        for(int j=2; j<array.length; j++) {
            if(array[minIndex] > array[j]) { //假设的最小值不成立
                minIndex = j;
            }
        }

        temp = array[1];
        array[1] = array[minIndex];
        array[minIndex] = temp;

        System.out.println("第二轮排序结果：" + Arrays.toString(array));*/
    }

}
