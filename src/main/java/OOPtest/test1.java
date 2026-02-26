package OOPtest;

import overrideex.Student;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        Person[] arr = new Person[3];

        arr[0] = new Person("Alice",12 ,"sd" );
        arr[1] = new Person("Bob", 13,"ad" );
        arr[2] = new Person("Cindy",14 ,"genn" );

        for(Person p : arr){
            System.out.println(p);
        }
    }
}
