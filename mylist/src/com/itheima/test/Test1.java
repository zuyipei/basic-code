package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list1 = new ArrayList<>();

        //2.添加元素
        list1.add("点赞了吗？");
        list1.add("收藏了吗？");
        list1.add("投币了吗？");
        list1.add("转发了吗？");

        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list1.size(); i++) {
            if(i == list1.size() - 1){
                System.out.print(list1.get(i));
            }else{
                System.out.print(list1.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
