package com.itheima.test;

import java.util.Scanner;

public class LoopTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于1的整数");
        int number = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是素数");
        } else {
            System.out.println(number + "不是素数");
        }
    }
}
