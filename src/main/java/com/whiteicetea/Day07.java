package com.whiteicetea;

import java.util.*;

public class Day07 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[][] nums = new int[10][];
//
//        for(int i=0;i<nums.length;i++){
//            nums[i] = new int[i+1];
//            for(int j=0;j<nums[i].length;j++){
//                nums[i][j] = i+1;
//            }
//        }
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }
//        char[] arr1 = {'a','z','b','c'};
//        char[] arr2 = arr1;
//        arr1[2]='t';
//        for (int i = 0; i < arr2.length; i++){
//            System.out.print(arr1[i]+","+arr2[i]+",");
//        }
        int[] arr = {20,56,23,75,34,26,42,89,48};
        int temp =0;
        for (int i = 0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
