package com.itheima.a08oopextendsdemo8;

public class Student extends Person{

    public Student(){
        //子类构造方法中隐藏的super()去访问父类的无参构造
        super();  //写不写默认都有，自己不写，虚拟机就给你加上。
        System.out.println("子类的无参构造");
    }


    public Student(String name,int age){
       super(name,age);
    }


}
