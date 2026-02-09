package com.whiteicetea;


import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        Fibonacci_long fib = new Fibonacci_long();
        System.out.println(fib.mat(n));
    }
}

class Fibonacci_long{

    public long mat(long n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return mat(n-2)+mat(n-1);
    }

}
