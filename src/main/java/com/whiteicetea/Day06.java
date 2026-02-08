package com.whiteicetea;

import java.util.*;


public class Day06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums ={"1","2","3","4","5","6","7","8","9"};
        String s = in.nextLine();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i].equals(s)){
                System.out.println(nums[i]);
                break;
            }else{
                System.out.println("Not a number");
                break;
            }
        }
    }
}
