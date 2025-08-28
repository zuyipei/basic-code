package com.itheima.a10oopextendsdemo10;

public class Manager extends Employee{

    private double bouns;

    //空参构造
    public Manager() {
    }

    //带全部参数的构造
    //父类 + 子类 所有的成员变量都需要初始化
    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    //get/set
    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    //成员方法
    //工作
    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
