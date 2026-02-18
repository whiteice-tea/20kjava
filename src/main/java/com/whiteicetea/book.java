package com.whiteicetea;

public class book {
    public static void main(String[] args) {
        Book1 b1 = new Book1(200);
        System.out.println(b1.price);
    }
}

class Book1 {
    double price;

    public Book1(double price){
        if(price<100){
            this.price = price;
        }else if(price>=100 && price<150){
            this.price = 100;
        }else if(price>=150 ){
            this.price = 150;
        }
    }
}
