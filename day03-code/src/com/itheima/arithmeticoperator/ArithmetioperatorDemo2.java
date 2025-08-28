package com.itheima.arithmeticoperator;

public class ArithmetioperatorDemo2 {
    public static void main(String[] args) {
        //1. 整数参与运算，结果只能是整数
        //2. 小数参与计算，结果有可能是不精确的，如果需要精确计算，需要……
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);

        //取模，取余，实际上也是除法运算，只不过得到的是余数而已。
        System.out.println(10 % 2); //0
        System.out.println(10 % 3); //1

        //应用场景
        //1.判断一个数是否能被另一个数整除
        //2.判断一个数是否为偶数
        //……
    }
}


