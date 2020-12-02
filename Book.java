package com.test.car;

public class Book {
    private static SingleTon pages;
    public int count;
    public Book(){

    }
    public static SingleTon getPages(){
        if (pages == null){
            pages = new SingleTon();
        }
        return pages;
    }
}
