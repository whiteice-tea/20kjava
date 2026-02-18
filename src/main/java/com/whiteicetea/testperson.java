package com.whiteicetea;

public class testperson {
    public static void main(String[] args) {
        Personte p1 = new Personte("tt",20);
        Personte p2 = new Personte("tt",20);
        Personte p3 = new Personte("tt",30);

        System.out.println(p1.compareto(p3));
    }
}

class Personte {
    String name;
    int age;

    public Personte(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareto(Personte p){
        if(this.name.equals(p.name)&&this.age == p.age){
            return true;
        }
        return false;
    }
}