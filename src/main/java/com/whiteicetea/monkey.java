package com.whiteicetea;

public class monkey {
    public static void main(String[] args) {
        monkey1 m = new monkey1();
        System.out.println(m.peach(1));
    }
}


class monkey1 {
    public int peach(int day){
        if(day == 10){
            return 1;
        }else if(day>=1&&day<=9){
            return (peach(day+1)+1)*2;
        }
        return 0;
    }
}