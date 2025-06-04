package com.adobe.AdapterPattern;

public interface Duck {
    public void quack();
    public void fly();
}

class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
