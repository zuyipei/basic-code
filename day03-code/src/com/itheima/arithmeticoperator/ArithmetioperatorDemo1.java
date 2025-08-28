package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class ArithmetioperatorDemo1 {
    public static void main(String[] args) {
        System.out.println(3 + 2); // 5
        System.out.println(1.1 + 1.01);     // 2.1100000000000003

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();

        System.out.println("请输入女婿的年龄");
        int age = sc.nextInt();

        System.out.println(age);

        if (wine >= 5) {
            System.out.println("小伙子，不错呦！");
        } else {
            System.out.println("小伙子，你可以多喝点酒");
        }
    }
}
