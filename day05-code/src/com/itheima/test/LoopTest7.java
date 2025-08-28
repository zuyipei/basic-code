package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true) {
            System.out.println("请输入你想要猜的数字");
            int guess = sc.nextInt();
            count++;
            if (guess > number) {
                if (count < 5) {
                    System.out.println("猜大了");
                }else {
                    System.out.println("又猜大了，你已经猜了五次了，游戏结束");
                    break;
                }
            } else if (guess < number) {
                if (count < 5) {
                    System.out.println("猜小了");
                }else {
                    System.out.println("又猜小了，你已经猜了五次了，游戏结束");
                    break;
                }
            } else {
                System.out.println("猜中了");
                System.out.println("你猜了" + count + "次");
                break;
            }
        }
    }


}
