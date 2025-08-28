package com.itheima.test;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) ;//都是从0开始的，  到这个数-1为止
        System.out.println(number);


        //不从0开始。
        //
        // 比如7～15
        int number2 = r.nextInt(9) + 7;
        //比如1～100
        int number3 = r.nextInt(100) + 1;
    }
}
