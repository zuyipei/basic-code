package com.itheima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
//        int processors = availableProcessors();  //非静态方法，得获取对象之后用

        //Runtime代表运行环境,所以只能创建一个Runtime对象
        //1.获取Runtime对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == r2);


        //2.exit 停止虚拟机
//        Runtime.getRuntime().exit(0);
//        System.out.println("看看我执行了吗?");

        //3.获得CPU线程数
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);

        //4.获得内存信息,单位byte
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println(maxMemory);
        //5.获得空闲内存
        long freeMemory = Runtime.getRuntime().freeMemory() / 1024 / 1024;
        System.out.println(freeMemory);
        //6.获得总内存
        long totalMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println(totalMemory);

        //7.执行系统命令
//        Runtime.getRuntime().exec("notepad");
        //-s 默认在1分钟后关机
        //-s -t 指定时间关机 时间单位：秒
        //-r 重启
        //-a 取消关机操作
        Runtime.getRuntime().exec("shutdown -s -t 3600"); //关机
        Runtime.getRuntime().exec("shutdown -a");//取消关机

    }
}
