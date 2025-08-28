package com.itheima.a01innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;


    public void show(Car this){
        //是打印调用者车的名字：宾利
        System.out.println(this.carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
//        System.out.println(engineName);//编译报错，引擎类的成员变量，外部类不能直接访问
    }


    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);//可以
        }
    }
}
