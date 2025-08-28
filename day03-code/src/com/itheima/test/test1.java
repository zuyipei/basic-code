package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，获取……

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();

        //2.获取个位，十位，百位
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number /100 % 10;

        // println 方法通常接收单个参数，你可以通过字符串拼接或者格式化输出来同时打印多个变量。
        // 使用字符串拼接修复输出问题
        System.out.println("个位: " + ge + ", 十位: " + shi + ", 百位: " + bai);
        // 或者使用格式化输出
        System.out.printf("个位: %d, 十位: %d, 百位: %d\n", ge, shi, bai);
    }
}
