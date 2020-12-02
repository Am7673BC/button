package com.test.car;

public class SingleTon {
    private static SingleTon instance;
    public int count;
    public SingleTon(){

    }
    public static SingleTon getInstance() {
       if (instance == null){
            instance = new SingleTon();
       }
       return instance;
    }
}
