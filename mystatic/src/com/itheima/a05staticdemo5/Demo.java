package com.itheima.a05staticdemo5;

public class Demo {
    public static void main(String[] args) {
        // 调用静态方法
        staticMethod();

        // 调用非静态方法，需要先创建对象
        Demo demo = new Demo();
        demo.instanceMethod();
    }

    public static void staticMethod() {
        System.out.println("这是静态方法");
    }

    public void instanceMethod() {
        System.out.println("这是非静态方法");
    }
}
