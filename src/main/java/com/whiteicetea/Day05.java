package com.whiteicetea;

import java.util.*;

public class Day05 {
    public static void main(String[] args) {
        //正数的原码，反码补码都一样
        //负数的反码=它的原码符号位不变，其它位取反（0->1，1->0）
        //负数的补码=它的反码+1，负数的反码=负数的补码-1
        //0的反码，补码都是0
        //在计算机运算的时候，都是以补码的方式来运算的。
        //当我们看运算结果的时候，要看他的原码（重点）
        //System.out.println(~2);
//        Scanner in = new Scanner(System.in);
//        char ch = in.next().charAt(0);
//        switch(ch){
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("B");
//                break;
//            case 'c':
//                System.out.println("C");
//                break;
//        }
//        for(int i=1;i<=5;i++){
//            System.out.print(ch);
//        }
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+"*"+i+"="+(i*j)+"  ");
//
//            }
//            System.out.println("\n");
//        }
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for(int i=1;i<=5;i++){
//            for(int l=1;l<=5-i;l++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//
//                if(j==1||j==2*i-1||i==5){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
        int j = 1;
        int sum = 0;

        for(int i=1;i<=100;i++){
            for(int k=1;k<=i;k++){
                sum+=k;
            }
        }
        System.out.println(sum);
    }
}
