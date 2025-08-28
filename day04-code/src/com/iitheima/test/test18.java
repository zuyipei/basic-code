package com.iitheima.test;

import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        int temp = a;

        int b =0;
        while (a!=0) {
            int ge = a % 10;
            a = a / 10;
            b = b * 10 + ge;
        }
        System.out.println(b);
        System.out.println(temp == b);
    }
}
