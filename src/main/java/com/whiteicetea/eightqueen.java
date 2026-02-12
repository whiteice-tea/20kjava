package com.whiteicetea;

public class eightqueen {
    public static void main(String[] args) {
        int n=8;
        int[] pos = new int[n];
        queen t1 = new queen(n,pos);
        System.out.println(t1.dfs(0));

    }
}

class queen {
    int n;     // 皇后数量，也是棋盘大小
    int[] pos; // 只用这一个数组：pos[row] = col,数组下表为行，值为列

    public queen(int n, int[] pos) {
        this.n = n;
        this.pos = pos;
    }
    public int dfs(int row){
            if(row==n){
                return 1;
            }
            int count=0;
            for(int col=0;col<n;col++){
                if(isvalued(row,col)){
                    pos[row]=col;
                    count+=dfs(row+1);
                    System.out.println(count);
                    pos[row]=-1;
                }
            }
            return count;
    }

    boolean isvalued(int row,int col) {
        for(int r=0;r<row;r++){
            int c=pos[r];
            if(c==col)return false;

            if(Math.abs(row-r)==Math.abs(c-col))return false;
        }
        return true;
    }
}