package com.whiteicetea;

import java.util.*;


public class hannuota {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        tower t1 = new tower();
        t1.fac(n,'a','b','c');
    }
}

class tower {
    public void fac(int n, char from, char helper, char to) {
        if (n == 1) {
            System.out.println("disk 1: " + from + " -> " + to);
            return;
        }

        fac(n - 1, from, to, helper);
        System.out.println("disk " + n + ": " + from + " -> " + to);
        fac(n - 1, helper, from, to);
    }
}


