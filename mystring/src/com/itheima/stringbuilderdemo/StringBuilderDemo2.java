package com.itheima.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }

        //这个是java已经写好的类，java在底层做了一些特殊处理，所以直接打印出来不是地址值，而是属性值。
        System.out.println(sb);
    }
}
