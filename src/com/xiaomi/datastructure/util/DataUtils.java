package com.xiaomi.datastructure.util;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 工具类
 */
public class DataUtils {

    /**
     * 格式化当前时间
     * @param date
     * @return
     */
    public static String getDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 生成100000个int数组
     * @return
     */
    public static int[] getArrayData() {
        int count = 500000;
        int[] array = new int[count];
        for(int i=0; i<count; i++) {
            array[i] = (int) (Math.random()*500000);
        }
        return array;
    }

    public static void main(String[] args) {
        //System.out.println(getDate(new Date()));

        System.out.println(Arrays.toString(getArrayData()));
    }

}
