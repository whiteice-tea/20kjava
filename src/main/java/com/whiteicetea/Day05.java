package com.whiteicetea;

public class Day05 {
    public static void main(String[] args) {
        //正数的原码，反码补码都一样
        //负数的反码=它的原码符号位不变，其它位取反（0->1，1->0）
        //负数的补码=它的反码+1，负数的反码=负数的补码-1
        //0的反码，补码都是0
        //在计算机运算的时候，都是以补码的方式来运算的。
        //当我们看运算结果的时候，要看他的原码（重点）
        System.out.println(~2);
    }
}
