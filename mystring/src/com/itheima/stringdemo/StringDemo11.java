package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //1.定义一个字符串记录身份证号码
        String id = "321281202001011234";

        //2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);


        System.out.println("人物信息为：");
        System.out.println("出生年月日:" + year + "年" + month + "月" + day + "日");

        //3.获取性别
        char gender = id.charAt(16);
//        // '3'  ---> 3  方法一 利用ASCII码表进行转换
//        int num = gender - 48;
//        // '3'  ---> 3  方法二 char->string->int
//        int num = Integer.parseInt(String.valueOf(gender)));
        // '3'  ---> 3  方法三 char->int
        int num = Character.getNumericValue(gender);

        if(num % 2 == 0){
            System.out.println("性别为:女");
        }else{
            System.out.println("性别为:男");
        }



    }
}
