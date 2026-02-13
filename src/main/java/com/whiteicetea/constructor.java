package com.whiteicetea;


public class constructor {
    public static void main(String[] args) {
        person1 p1 =new person1("LIU",19);
        System.out.println(p1.age);
    }
}


class person1{
    String name;
    int age;

    //构造器没有返回值，也不能写void
    //构造器名称和类一样
    //构造器形参列表，规则和成员方法一样
    public person1(String pname, int page){
        name = pname;
        age = page;
    }
}