package com.iitheima.test;

public class test17 {
    public static void main(String[] args) {
        double hight = 8844430;
        double paper = 0.1;

        int count = 0;
        while( paper< hight) {
            paper = paper * 2;
            count++;
        }
        System.out.println(count); //27次
    }
}
