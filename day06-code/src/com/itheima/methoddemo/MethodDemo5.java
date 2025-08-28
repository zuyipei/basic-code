package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        int sum = getSum(10,20,30);
        System.out.println(sum);
    }

    public static int getSum(int a, int b, int c) {
        return a+b+c;
    }
}
