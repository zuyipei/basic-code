package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i * i == number) {
                System.out.println(i + "就是" + number + "的平方根");
                break;
            } else if (i * i > number) {
                System.out.println((i - 1) + "就是" + number + "的平方根的整数部分");
                break;
            }
        }
    }
}

