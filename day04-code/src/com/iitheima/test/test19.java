package com.iitheima.test;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个被除数：");
        int a = sc.nextInt();
        System.out.println("请输入一个除数：");
        int b = sc.nextInt();

        int count = 0;
        while (a >= b) {
            a = a - b;
            count++;
        }
        System.out.println("商为：" + count);
        System.out.println("余数为：" + a);
    }

}
