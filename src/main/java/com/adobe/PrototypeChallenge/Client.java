package com.adobe.PrototypeChallenge;

public class Client {
    public static void main(String[] args){
        BaseCarCache.loadCache();
        BaseCar nano= BaseCarCache.getCar("Nano");
        BaseCar nano1= BaseCarCache.getCar("Nano");
        System.out.println("Nano 1"+ nano+ " nano 2 "+nano1);
        nano1.printCarModel();
        BaseCar ford= BaseCarCache.getCar("Ford");
        ford.printCarModel();
        ford.printCarModel();
    }
}
