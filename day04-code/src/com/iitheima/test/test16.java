package com.iitheima.test;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数字，表示开始范围：");
        int start = sc.nextInt();
        System.out.println("请输入一个数字，表示结束范围：");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0  && i % 5 == 0) {
                sum++;
            }
        }
        System.out.println(start+"到"+end+"之间能被3整除且能被5整除的数字有"+sum+"个");
    }
}
