package com.itheima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，TMD";

        //2.把里面的敏感词TMD替换为***
        String result = talk.replace("TMD", "***");

        //3.打印结果
        System.out.println(result);
    }
}
