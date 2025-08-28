package com.itheima.a04staticdemo4;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        Student.teacherName="阿伟老师";

        Student s1 = new Student();
        System.out.println("s1的地址值："+s1);
        s1.name="zhangsan";
        s1.age=25;
        s1.show1();//在这里调用show1方法，this就表示s1
//        s1.show1(s1);//这会报错，因为show1方法的参数是this，而this是由虚拟机赋值的，不能手动赋值

        System.out.println("----------------");
        Student s2 = new Student();
        System.out.println("s2的地址值："+s2);
        s2.name="wangwu";
        s2.age=26;
        s2.show1();
    }
}
