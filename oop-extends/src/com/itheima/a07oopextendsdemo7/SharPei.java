package com.itheima.a07oopextendsdemo7;

public class SharPei extends Dog{

    //因为沙皮狗吃的狗粮和骨头
    //父类中的方法不能满足我们的需求了，所以需要进行重写
    @Override
    public void eat() {
        System.out.println("沙皮狗的eat方法");
        super.eat();//吃狗粮  super.eat();：调用父类的 eat() 方法（在当前对象上）。
        new Dog().eat();//可以创建一个新的 Dog 对象来调用（但一般没必要）。
//        Dog.eat(); //Dog.eat(); 这种写法是类名.方法名，只能调用静态方法。
//                      你的 Dog 类里的 eat() 是实例方法（非 static），不能用 Dog.eat(); 这样调用。
//                      只能通过对象或者 super 关键字调用。
        System.out.println("狗啃骨头");
    }
}
