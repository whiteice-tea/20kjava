package com.whiteicetea;

import java.util.*;
public class Day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyCalculator calc = new MyCalculator();
        System.out.println(calc.calculate(1,2));
        System.out.println(calc.calculate(1.1,2));
        System.out.println(calc.calculate(1,2.2));
        System.out.println(calc.calculate(1,2,3));
    }
}


class MyCalculator {
    public int calculate(int n1,int n2){
        return n1+n2;
    }
    public double calculate(int n1,double n2){
        return n1+n2;
    }
    public double calculate(double n1,int n2){
        return n1+n2;
    }
    public int calculate(int n1,int n2,int n3){
        return n1+n2+n3;
    }

}