package com.whiteicetea;

import java.util.*;

public class varparameterExercise {
    public static void main(String[] args) {
        //Scanner sc =  new Scanner(System.in);
        HspMethod s1 = new HspMethod();

        s1.showScore("LIU",100,100,100,100,100);
    }
}



class HspMethod{

    public void showScore(String name,double... score){
        double sum = 0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }
        System.out.println(name+":"+sum);
    }
}