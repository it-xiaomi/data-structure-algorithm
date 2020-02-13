package com.xiaomi.algorithm;

public class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(10, 'A', 'B', 'C');
    }

    public static void hanoiTower(int num, char a, char b, char c) {
        // 如果只有一个盘
        if(num == 1) {
            System.out.println("第1个盘从 " + a + "->" + c);
        } else {
            /**
             * 如果有两个（包含两个）以上的盘，我们总是可以看做两个盘
             * 1是最下面的盘；2是上面的所有盘
             */
            // 1.先把上面所有的盘移动 A->B, 移动过程中会用到c塔
            hanoiTower(num - 1, a, c, b);
            // 2.把最下面的盘移动 A->C
            System.out.println("第" + num + "个盘从 " + a + "->" + c);
            // 3.把B塔上的所有盘移动 B->C, 移动过程中会用到a塔
            hanoiTower(num - 1, b, a, c);
        }
    }
}
