package com.adobe.PrototypeChallenge;

import java.util.Hashtable;

public class BaseCarCache {
    private static Hashtable<String,BaseCar> map=new Hashtable<>();
    public static BaseCar getCar(String n){
        BaseCar baseCar= map.get(n);
        try {
            return  baseCar.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadCache(){
        BaseCar nano= new Nano("Nano");
        map.put("Nano",nano);
        BaseCar ford= new Ford("Ford");
        map.put("Ford",ford);

    }
}
