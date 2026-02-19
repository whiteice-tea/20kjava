package com.whiteicetea;

public class findstr {
    public static void main(String[] args) {

    }
}

class a{
    String str;

    public a(String str){
        this.str = str;
    }

    public int find(String str,String[] strs){
        for(int i=0;i<strs.length;i++){
            if(str.equals(strs[i])){
                return i;
            }
        }
        return -1;
    }

    public int[] copyarr(int[] a){
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        return b;
    }

    int r;
    public double circle(int r){
        return Math.PI*r*r;
    }
}