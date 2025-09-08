package com.itheima.a01mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {
        /*
            public static int abs(int a) 获取参数绝对值
            public static double ceil(double a) 向上取整
            public static double floor(double a) 向下取整
            public static int round(float a) 四舍五入
            public static int max(int a,int b) 获取两个int值中的较大值
            public static double pow(double a,double b) 返回a的b次幂的值
            public static double random() 返回值为double的随机值，范围[0.0,1.0)
        */


        //abs 获取参数绝对值
        System.out.println(Math.abs(-188.25));
        System.out.println(Math.abs(88.0));
        System.out.println(Math.abs(-88));
        //bug:
        //以int类型为例，取值范围: -2147483648~ 2147483647
        //如果没有正数与负数对应，那么传递负数结果有误
        //-2147483648 没有正数与之对应，所以abs结果产生bug
        System.out.println(Math.abs(-2147483648));//-2147483648
        System.out.println(Math.abs(-2147483647));//2147483647
//        System.out.println(Math.absExact(-2147483648));// Overflow to represent absolute value of Integer.MIN_VALUE

        System.out.println("-------------------------------");
        //进一法，往数轴的正方向进一
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(12.54));//13.0
        System.out.println(Math.ceil(-12.34));//-12.0
        System.out.println(Math.ceil(-12.54));//-12.0
        System.out.println(Math.ceil(-0.99));//-0.0


        System.out.println("-------------------------------");
        //去尾法，往数轴的负方向进一
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(12.54));//12.0
        System.out.println(Math.floor(-12.34));//-13.0
        System.out.println(Math.floor(-12.54));//-13.0
        System.out.println(Math.floor(0.11));//0.0


        System.out.println("-------------------------------");
        //四舍五入
        System.out.println(Math.round(12.34));//12
        System.out.println(Math.round(12.54));//13
        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.54));//-13


        System.out.println("-------------------------------");
        //获取两个整数的较大值
        System.out.println(Math.max(20,30));//30
        //获取两个整数的较小值
        System.out.println(Math.min(20,30));//20
        System.out.println(Math.max(20.19,20.50));


        System.out.println("-------------------------------");
        // 获取a的b次幂
        System.out.println(Math.pow(2,3));//8
        // 细节:
        //如果第二个参数 0~ 1之间的小数, 代表开根号。
        System.out.println(Math.pow(4,0.5));//2.0
        System.out.println(Math.pow(2,-2));//0.25
        System.out.println(Math.pow(2,-2.5));//0.1767766952966369
        //建议:
        //第二个参数:一般传递大于等于1的正整数。
        System.out.println(Math.sqrt(4));//2.0
        System.out.println(Math.cbrt(8));//2.0


        System.out.println("-------------------------------");
        //Math.random() [0.0 1.0)
        System.out.println(Math.floor(Math.random()*100)+1);
        //* 100         [0.0 100.0)
        //floor         去掉了后面的小数
        //+1            [1 100.e]

    }
}