package com.itheima.a09oopextendsdemo9;

public class Student {
    String name;
    int age;
    String school;

    //需求：
    //默认为传智大学

    public Student() {
        //表示调用本类其他构造方法
        this(null,0,"传智大学");  //空参构造，默认转为本类其他构造。 并把school默认为"传智大学"
                                                //this()调用本类其他构造方法，必须在第一行
                                                 // 细节：虚拟机就不会再添加super();
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
