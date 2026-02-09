package com.whiteicetea;

import java.util.*;

public class Day08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cat cat1=new Cat();
        cat1.name=in.nextLine();
        cat1.age=in.nextInt();

        cat1.speak();


    }
}

class Cat {
    String name;
    int age;
    public void speak(){
        System.out.println(name);
    }
}