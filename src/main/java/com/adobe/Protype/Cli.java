package com.adobe.Protype;

public class Cli {
    public static void main(String[] args){
        ShapeCache.loadCache();
       Shape s= ShapeCache.getShape("1");
       System.out.println("type of shape is "+s.getType());
        Shape r= ShapeCache.getShape("2");
        System.out.println("type of shape is "+r.getType());
    }
}
