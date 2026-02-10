//package com.whiteicetea;
//
//import java.util.*;
//public class mouse {
//    public static void main(String[] args) {
////        int [][] map = new int [8][7];
////        for (int i=0;i<8;i++){
////            for (int j=0;j<7;j++){
////                if(i==0||j==0||i==7||j==6){
////                    map[i][j]=1;
////                }else {
////                    map[i][j]=0;
////                }
////            }
////        }
////        map[3][1] =1;
////        map[3][2] =1;
//        int[][] map = {
//                {1, 1, 1, 1, 1, 1, 1, 1}, // Row 0
//                {1, 0, 0, 0, 1, 0, 0, 1}, // Row 1 (2 是起点 S)1,1
//                {1, 1, 1, 0, 1, 0, 1, 1}, // Row 2
//                {1, 0, 0, 0, 0, 0, 0, 1}, // Row 3
//                {1, 0, 1, 1, 1, 1, 0, 1}, // Row 4 (4 是你的 USDT 交易点)1,4
//                {1, 0, 0, 5, 1, 0, 0, 1}, // Row 5 (5 是终点 E)5,5
//                {1, 1, 1, 1, 1, 1, 1, 1}  // Row 6
//        };
//        T t1 = new T();
//        t1.findway(map,1,1);
//
//
//
//
//
//
//
//        for (int i=0;i<7;i++){
//            for (int j=0;j<8;j++){
//                System.out.print(map[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
//}
//class T{
////    map是迷宫，找到返回true，否则返回false，i和j是老鼠的位置，初始化位置是1，1
//    //0为未走过但可以走通，1为障碍物，2为走过可以走通，3为试过不能走通
//    public boolean findway(int[][] map,int i,int j){
//        if(map[i][j]==5){
//            return true;
//        }else{
//            if(map[i][j]==0){
//                map[i][j]=2;
//                if(findway(map,i+1,j)){
//                    return true;
//                }else if(findway(map,i,j+1)){
//                    return true;
//                }else if(findway(map,i-1,j)){
//                    return true;
//                }else if(findway(map,i,j-1)){
//                    return true;
//                }else{
//                    map[i][j]=3;
//                    return false;
//                }
//            }else{
//                return false;
//            }
//        }
//    }
//}
package com.whiteicetea;

public class mouse {

    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1, 1}, // Row 0
                {1, 0, 0, 0, 1, 0, 0, 1}, // Row 1  起点(1,1)
                {1, 1, 1, 0, 1, 0, 1, 1}, // Row 2
                {1, 0, 0, 0, 0, 0, 0, 1}, // Row 3
                {1, 0, 1, 1, 1, 1, 0, 1}, // Row 4
                {1, 0, 0, 5, 1, 0, 0, 1}, // Row 5  终点(5,3)
                {1, 1, 1, 1, 1, 1, 1, 1}  // Row 6
        };

        T t1 = new T();
        boolean ok = t1.findway(map, 1, 1);

        System.out.println("\n==== 最终结果 ====");
        System.out.println("是否找到路: " + ok);
        T.printMap(map, -1, -1, "FINAL"); // 最后再打印一次（不标老鼠）
    }
}

class T {

    // 你可以调这个：每一步停多久（毫秒）
    private static final int DELAY_MS = 250;

    // 递归调用次数计数器
    private static int step = 0;

    // 0=未走过可走，1=墙，2=走过可走，3=死路
    public boolean findway(int[][] map, int i, int j) {

        // 每进入一次递归就打印一次（这是你要求的）
        step++;
        int val = map[i][j];
        printMap(map, i, j, "ENTER step=" + step + "  pos=(" + i + "," + j + ")  val=" + val);
        sleep();

        // 命中终点
        if (map[i][j] == 5) {
            printMap(map, i, j, "HIT END (5)  return true");
            sleep();
            return true;
        }

        // 只有 0 才能走
        if (map[i][j] == 0) {
            map[i][j] = 2;
            printMap(map, i, j, "MARK 2 (try path)");
            sleep();

            // 下
            if (findway(map, i + 1, j)) {
                return true;
            }
            // 右
            if (findway(map, i, j + 1)) {
                return true;
            }
            // 上
            if (findway(map, i - 1, j)) {
                return true;
            }
            // 左
            if (findway(map, i, j - 1)) {
                return true;
            }

            // 四个方向都不行 -> 死路
            map[i][j] = 3;
            printMap(map, i, j, "MARK 3 (dead end)  return false");
            sleep();
            return false;
        }

        // 走到墙/已走过/死路（1/2/3）直接失败
        printMap(map, i, j, "BLOCKED (not 0/5)  return false");
        sleep();
        return false;
    }

    // 打印地图：把当前位置标成 M，其他照常显示数字
    public static void printMap(int[][] map, int mi, int mj, String title) {
        System.out.println("\n---------------- " + title + " ----------------");
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                if (r == mi && c == mj) {
                    System.out.print("M\t"); // 老鼠当前位置
                } else {
                    System.out.print(map[r][c] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }

    private static void sleep() {
        try {
            Thread.sleep(DELAY_MS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
