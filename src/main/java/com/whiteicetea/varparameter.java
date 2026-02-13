package com.whiteicetea;

public class varparameter {
    public static void main(String[] args) {

    }
}

class A {
    public int st(int... nums){//本质是个数组，但这样写调用更方便
        //一个形参列表中只能出现一个可变参数
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    public void f2(String s,double... nums){//可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后

        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * 2;
        }

    }
}