package com.itheima.a03interfacedemo3;

public class InterImpl implements Inter1,Inter2{

    @Override
    public void method1() {
        System.out.println("method1");
    }//既表示重写了Inter1的方法，也表示重写了Inter2的方法

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method4() {
        System.out.println("method4");
    }
}
