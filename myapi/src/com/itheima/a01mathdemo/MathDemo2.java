package com.itheima.a01mathdemo;

public class MathDemo2 {
    public static void main(String[] args) {
        //判断一个数是否为一个质数
        System.out.println(isPrime(756173));
        //997 2~996 995次
    }

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                System.out.println(count);
                System.out.println(i +" " + number/i);
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}