package com.itheima.arraydemo;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        //1.定义数组10个double
        int[] arr = new int[10];
        //2.生成1~100随机数，存入数组
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        //3.遍历数组求出“和”、“平均数”
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        //4.统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        //5.输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   //删掉ln就是同一行。 带着ln就是一个数据一行
        }
        System.out.println("和：" + sum);
        System.out.println("平均值：" + avg);
        System.out.println("比平均值小的数的个数：" + count);
    }

}
