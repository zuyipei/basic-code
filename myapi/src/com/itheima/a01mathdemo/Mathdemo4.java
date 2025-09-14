package com.itheima.a01mathdemo;

public class Mathdemo4 {
    public static void main(String[] args) {
        //要求3:统计一共有多少个五角星数

        //五角星数:10000 ~ 99999
        int count = 0;
        for (int i = 100; i <= 99999; i++) {
            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            //判断:
            //每一位的三次方之和 跟本身 进行比较。
            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5) + Math.pow(wan, 5);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
