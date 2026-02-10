package com.whiteicetea;

import java.util.*;
public class Day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        T1 t1 = new T1();
        System.out.println(t1.factorial(a));

    }
}



class T1{
    public int factorial(int n){
        if(n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}