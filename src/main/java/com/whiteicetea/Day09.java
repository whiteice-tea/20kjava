package com.whiteicetea;

import java.util.*;
public class Day09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyTools myTools = new MyTools();
        int[][] myArr = {{1, 2}, {3, 4, 5}}; // 创建一个二维数组
        myTools.printarr(myArr);
    }
}

class MyTools{
    public void printarr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}