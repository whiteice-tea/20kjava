package com.whiteicetea;

import java.util.*;
public class Day09t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person p1 = new Person();
        p1.name = "Jack";
        p1.age = 18;
        Person p2 = new Person();
        p2= p1.copyPerson();
        p2.name = "tom";
        System.out.println(p1.name + " " + p2.name);
    }
}


class Person {
    String name;
    int age;
    public Person copyPerson(){
        Person p = new Person();
        p.name = this.name;
        p.age = this.age;
        return p;
    }
}