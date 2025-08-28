package com.itheima.a04staticdemo4;
/*
    非静态方法中默认隐含this关键字，静态方法中没有this关键字
    非静态方法中可以访问所有的成员变量和成员方法，静态方法中只能访问静态
 */
public class Student {
    String name;
    int age;
    static String teacherName;

    //this:表示当前方法调用者的地址值
    //这个this是由虚拟机赋值的
    public void show1(Student this) {
        System.out.println("this的地址值：" + this);
        System.out.println(this.name + ", " + this.age + ", " + teacherName);
        System.out.println(this.name + ", " + this.age + ", " + this.teacherName);
        //调用其他方法
        this.show2();
        this.method();
    }
    public void show2() {
        System.out.println("我是show2方法");
    }
//    //报错  不能加this
//    public static void method(Student this){
//        System.out.println("我是静态方法");
//    }
    //调用静态方法
    public static void method() {
        System.out.println("我是静态方法");
//        System.out.println(this.name);//报错  静态方法中不能调用非静态方法
//        this.show1();//报错  静态方法中不能调用非静态方法
    }
}
