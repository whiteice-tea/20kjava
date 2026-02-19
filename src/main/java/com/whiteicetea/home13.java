package com.whiteicetea;

public class home13 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius=10;
        passibject p = new passibject();
        p.printareas(c1,5);

    }
}

class Circle{
    public double radius;

    public double findarea(double radius){
        return Math.PI * radius * radius;
    }

}

class passibject{

    public void printareas(Circle c,int times){
        for(int i=1;i<=times;i++){
            c.radius=i;
            System.out.println(c.findarea(c.radius)+"    "+i);
        }
    }
}