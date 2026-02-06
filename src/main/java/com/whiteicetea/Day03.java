package com.whiteicetea;

public class Day03 {
    public static void main(String[] args){
//        int i=1;
//        i=i++;//规则使用临时变量
//        System.out.println(i);
        int days=59;
        int weeks=days/7;
        int leftdays=days%7;
        System.out.println(weeks);
        System.out.println(leftdays);
    }
}
