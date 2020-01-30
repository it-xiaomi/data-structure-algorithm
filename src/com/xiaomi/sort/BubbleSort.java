package com.xiaomi.sort;

import com.xiaomi.util.DataUtils;

import java.util.Arrays;
import java.util.Date;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {1,8,7,0,5,10,9,3};

        System.out.println("冒泡排序开始时间：" + DataUtils.getDate(new Date()));
//        bubbleSort(array);
        //测试100000个数据排序
        bubbleSort(DataUtils.getArrayData());
        System.out.println("冒泡排序结束时间：" + DataUtils.getDate(new Date()));

    }

    private static void bubbleSort(int[] array) {

        //优化
        boolean flag = true;

        for(int i=0; i<array.length-1; i++) {
            int temp;
            for(int j=0; j<array.length-1-i; j++) {
                if(array[j] < array[j+1]) {
                    flag = false;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

            //如果没有进入判断，说明数组已经有序，直接退出循环
            if(flag) {
                break;
            } else {
                flag = true;
            }
            //System.out.println("第"+(i+1)+"轮排序后结果：" + Arrays.toString(array));
        }

        //推导过程
        /*int temp;
        for(int j=0; j<array.length-1; j++) {
            if(array[j] > array[j+1]) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        System.out.println("第一轮排序后结果：" + Arrays.toString(array));

        for(int j=0; j<array.length-1-1; j++) {
            if(array[j] > array[j+1]) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        System.out.println("第二轮排序后结果：" + Arrays.toString(array));

        for(int j=0; j<array.length-1-2; j++) {
            if(array[j] > array[j+1]) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        System.out.println("第三轮排序后结果：" + Arrays.toString(array));*/

    }
}
